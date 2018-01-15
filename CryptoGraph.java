/* Arbitrage Cryptocurrency Graph Structure
 * Copyright 2018 Joshua Newhouse
 *
 * This code is licenced under the GPL.
 */

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.ArrayDeque;
import java.util.Deque;

public class CryptoGraph {
	private class Edge {
		public Node nextNode;
		public byte nextNodeID;
		public double xchMult;

		public
		Edge(Node nn, byte nnID, double xM) {
			this.nextNode = nn;
			this.nextNodeID = nnID;
			this.xchMult = xM;
		}
	}

	private class Node {
		public byte id;
		public ArrayList<Edge> edges;
		boolean isMarked;

		public
		Node(byte id) {
			this.id = id;
			this.edges = new ArrayList<Edge>();
			this.isMarked = false;
		}

		public void
		updateEdge(Node nn, byte nnID, double xM) {
			ListIterator<Edge> e_lIt = this.edges.listIterator();
			while(e_lIt.hasNext()) {
				Edge tmp = e_lIt.next();
				if(tmp.nextNodeID == nnID) {
					tmp.xchMult = xM;
					return;
				}
			}

			this.edges.add(new Edge(nn, nnID, xM));
		}
	}

	public class Path {
		public Deque<String> walk;
		public double effectiveReturnRate;
	}

	private Node[] referenceTable = new Node[Coins.NUMBER + 1];

	public
	CryptoGraph() {}

	public
	CryptoGraph(ExchangeRate[] input) {
		update(input);
	}

	private Node
	getNode(byte coin) {
		if(referenceTable[coin] == null)
			referenceTable[coin] = new Node(coin);

		return referenceTable[coin];
	}

	public void
	update(ExchangeRate[] input) {
		for(int i = 0; i < input.length; i++) {
			Node n1 = getNode(input[i].counterCurrency);
			Node n2 = getNode(input[i].baseCurrency);

			n1.updateEdge(n2, n2.id, input[i].bid);
			n2.updateEdge(n1, n1.id, 1.0 / input[i].ask);
		}
	}

	private class TableEntry {
		public byte parent;
		public double value;
	}

	private TableEntry[] table = initTable();

	private TableEntry[]
	initTable() {
		TableEntry[] retVal = new TableEntry[Coins.NUMBER + 1];

		for(int i = 1; i <= Coins.NUMBER; i++)
			retVal[i] = new TableEntry();

		return retVal;
	}

	private void
	clearTable() {
		table = initTable();
	}

	private Path
	createPath(byte startCoinID) {
		Path ret_val = new Path();
		Deque<String> queue = new ArrayDeque<String>();
		String base = Coins.coinNames[startCoinID];

		for(TableEntry te = table[startCoinID];	te.parent != startCoinID;
														te = table[te.parent]) {
			String temp = Coins.coinNames[te.parent];
			if(queue.contains(temp))
				return null;
			else				
				queue.addFirst(Coins.coinNames[te.parent]);
		}

		queue.addLast(base);
		queue.addFirst(base);

		ret_val.walk = queue;
		ret_val.effectiveReturnRate = table[startCoinID].value;
		return ret_val;
	}

	public ArrayList<Path>
	findPaths(String startCoin) {
		ArrayList<Path> paths = new ArrayList<Path>();

		byte startCoinID = Coins.stringToId(startCoin);
		Deque<Node> queue = new ArrayDeque<Node>();
		queue.add(getNode(startCoinID));

		TableEntry init = table[startCoinID];
		init.value = 1.0;
		init.parent = startCoinID;

		while(!queue.isEmpty()) {
			Node n = queue.remove();

			ListIterator<Edge> edgeIt = n.edges.listIterator();
			while(edgeIt.hasNext()) {
				Edge e = edgeIt.next();
				byte nextNodeID = e.nextNodeID;
				TableEntry te = table[n.id];
				TableEntry teNext = table[nextNodeID];

				double a;	//temp val
				if(nextNodeID != te.parent
				&& (a = te.value * e.xchMult) > teNext.value) {

					teNext.value = a;
					teNext.parent = n.id;

					if(nextNodeID != startCoinID
					&& !queue.contains(e.nextNode)) {
						queue.add(e.nextNode);
					}
					else if(nextNodeID == startCoinID
					&& table[startCoinID].value > 1) {
						Path temp = createPath(startCoinID);
						if(temp == null)
							return paths;
						else
							paths.add(temp);
					}
				}
			}
		}

		clearTable();
		return paths;
	}

	public double
	getExchangeRate(String fromCoin, String toCoin) {
		Node from = getNode(Coins.stringToId(fromCoin));
		byte to = Coins.stringToId(toCoin);

		ListIterator<Edge> eli = from.edges.listIterator();
		while(eli.hasNext()) {
			Edge e = eli.next();
			if(e.nextNodeID == to)
				return e.xchMult;
		}

		return 0.0;
	}
}
