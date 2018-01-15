/* Arbitrage Exchange Rate Structure
 * Copyright 2018 Joshua Newhouse
 *
 * This code is licenced under the GPL version 3.
 */

public class ExchangeRate {
	public byte counterCurrency;
	public byte baseCurrency;
	public double bid;
	public double ask;

	public
	ExchangeRate(String counterCur, String baseCur, double b, double a) {
		this.counterCurrency = Coins.stringToId(counterCur);
		this.baseCurrency = Coins.stringToId(baseCur);
		this.bid = b;
		this.ask = a;
	}
}
