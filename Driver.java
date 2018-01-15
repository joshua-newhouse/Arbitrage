/* Arbitrage Test Driver
 * Copyright 2018 Joshua Newhouse
 *
 * This code is licenced under the GPL.
 */

import java.util.Deque;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ExchangeRate[] rates1 = {
			new ExchangeRate("trx", "btc", 0.00000819, 0.00000824),
			new ExchangeRate("trx", "eth", 0.00009, 0.00009049),
			new ExchangeRate("eth", "btc", 0.091995, 0.09217),
			new ExchangeRate("icx", "btc", 5.105E-4, 5.154E-4),
			new ExchangeRate("icx", "bnb", 0.83, 0.835)
		};

		CryptoGraph cg = new CryptoGraph();
		cg.update(rates1);

		ArrayList<CryptoGraph.Path> paths = cg.findPaths("btc");

		for(int i = 0; i < paths.size(); i++) {
			printThePath(paths.get(i));
		}

		ExchangeRate[] rates2 = {
			new ExchangeRate("ltc", "btc", 0.015, 0.0155),
			new ExchangeRate("ltc", "bnb", 25.2, 25.208),
			new ExchangeRate("bnb", "btc", 6.146E-4, 6.149E-4),
			new ExchangeRate("trx", "btc", 1.237E-5, 1.239E-5),
			new ExchangeRate("ltc", "usdt", 241.65, 242.76),
			new ExchangeRate("eth", "usdt", 964.44, 967.0),
			new ExchangeRate("eth", "btc", 0.058128, 0.058181),
			new ExchangeRate("trx", "eth", 2.13E-4, 2.1321E-4),
		};

		cg.update(rates2);
		paths = cg.findPaths("eth");

		for(int i = 0; i < paths.size(); i++) {
			printThePath(paths.get(i));
		}

		System.out.println("btc-bnb: " + cg.getExchangeRate("btc", "bnb"));
		System.out.println("bnb-ltc: " + cg.getExchangeRate("bnb", "ltc"));
		System.out.println("ltc-btc: " + cg.getExchangeRate("ltc", "btc"));
		System.out.println("btc-trx:" + cg.getExchangeRate("btc", "trx"));
	}

	public static void
	printThePath(CryptoGraph.Path p) {
		Deque<String> walk = p.walk;
		boolean hasNext = !walk.isEmpty();

		while(hasNext) {
			System.out.print(walk.removeFirst());
			if(hasNext = !walk.isEmpty())
				System.out.print("->");
		}

		System.out.print("\tEffective return rate: " + p.effectiveReturnRate);
		System.out.println("");
	}
}

/*************** CryptoGraph.Path Class ****************

	public class Path {
		public Deque<String> walk;		//A queue of the strings making up the
										// path from start coin back to start
										// coin.

		public double effectiveReturnRate;	//The rate of ROI.  ex. 1.029 means
											// if you started with 1 btc you end
											// with 1.029 btc
	}

*******************************************************/

/*********** getExchangeRate method header *************

	public double
	getExchangeRate(String fromCoin, String toCoin)

*******************************************************/



/***************** Extra Test Data *********************************************

{:ltc-btc {:bids {0.015 9.86}, :asks {0.0155 24.56}},
 :ltc-bnb {:bids {25.2 11.74952}, :asks {25.28 2.25751}},
 :bnb-btc {:bids {6.146E-4 4.0}, :asks {6.194E-4 107.0}},
 :icx-btc {:bids {5.105E-4 246.93}, :asks {5.154E-4 200.0}},
 :icx-bnb {:bids {0.83 26.97}, :asks {0.85 20.01}}}
	trx-btc {:bids {1.237E-5 600.0}, :asks {1.239E-5 600.0}},

:bcc-usdt {:bids {2365.46 2.15}, :asks {2371.75 5.0E-5}},
 :icx-btc {:bids {4.065E-4 14.13}, :asks {4.066E-4 3741.6}},
 :neo-eth {:bids {0.097649 5.21}, :asks {0.098078 2.56}},
 :xvg-eth {:bids {1.6942E-4 10893.0}, :asks {1.707E-4 16633.0}},
 :trx-btc {:bids {1.237E-5 600.0}, :asks {1.239E-5 600.0}},
 :trx-eth {:bids {2.13E-4 1175.0}, :asks {2.1321E-4 2977.0}},
 :btc-usdt {:bids {16612.71 0.12}, :asks {16630.0 1.02E-4}},
 :ltc-bnb {:bids {17.55 0.07575}, :asks {17.63 1.0E-5}},
 :neo-btc {:bids {0.005665 77.3}, :asks {0.005683 316.56}},
 :neo-usdt {:bids {94.461 16.674}, :asks {94.679 3.0}},
 :ltc-usdt {:bids {241.65 0.82764}, :asks {242.76 2.88687}},
 :neo-bnb {:bids {6.877 8.297}, :asks {6.908 0.499}},
 :eth-btc {:bids {0.058128 0.018}, :asks {0.058181 9.111}},
 :ltc-btc {:bids {0.01455 14.5}, :asks {0.014589 0.86}},
 :bnb-usdt {:bids {13.6806 1.0}, :asks {13.7 0.98}},
 :icx-bnb {:bids {0.48498 55.36}, :asks {0.49988 510.68}},
 :bnb-btc {:bids {8.2287E-4 715.0}, :asks {8.2596E-4 190.0}},
 :xrp-eth {:bids {0.00264325 1466.0}, :asks {0.0026474 638.0}},
 :eth-usdt {:bids {964.44 6.76}, :asks {967.0 5.68809}},
 :xvg-btc {:bids {9.85E-6 24601.0}, :asks {9.86E-6 219510.0}},
 :xrp-btc {:bids {1.5355E-4 1562.0}, :asks {1.5385E-4 79.0}}}
*/
