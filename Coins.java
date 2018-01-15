/* Arbitrage Crypto Coin Data
 * Copyright 2018 Joshua Newhouse
 *
 * This code is licenced under the GPL version 3.
 */

public class Coins {
	public static final byte NUMBER = 99;

	public static final byte BTC = 1;
	public static final byte BNB = 2;
	public static final byte ETH = 3;
	public static final byte USDT = 4;
	public static final byte ADA = 5;
	public static final byte ADX = 6;
	public static final byte AION = 7;
	public static final byte AMB = 8;
	public static final byte ARK = 9;
	public static final byte ARN = 10;
	public static final byte AST = 11;
	public static final byte BAT = 12;
	public static final byte BCC = 13;
	public static final byte BCD = 14;
	public static final byte BCPT = 15;
	public static final byte BNT = 16;
	public static final byte BQX = 17;
	public static final byte BRD = 18;
	public static final byte BTG = 19;
	public static final byte BTS = 20;
	public static final byte CDT = 21;
	public static final byte CMT = 22;
	public static final byte CND = 23;
	public static final byte CTR = 24;
	public static final byte DASH = 25;
	public static final byte DGD = 26;
	public static final byte DLT = 27;
	public static final byte DNT = 28;
	public static final byte EDO = 29;
	public static final byte ELF = 30;
	public static final byte ENG = 31;
	public static final byte ENJ = 32;
	public static final byte EOS = 33;
	public static final byte ETC = 34;
	public static final byte EVX = 35;
	public static final byte FUEL = 36;
	public static final byte FUN = 37;
	public static final byte GAS = 38;
	public static final byte GTO = 39;
	public static final byte GVT = 40;
	public static final byte GXS = 41;
	public static final byte HSR = 42;
	public static final byte ICN = 43;
	public static final byte ICX = 44;
	public static final byte IOTA = 45;
	public static final byte KMD = 46;
	public static final byte KNC = 47;
	public static final byte LEND = 48;
	public static final byte LINK = 49;
	public static final byte LRC = 50;
	public static final byte LSK = 51;
	public static final byte LTC = 52;
	public static final byte LUN = 53;
	public static final byte MANA = 54;
	public static final byte MCO = 55;
	public static final byte MDA = 56;
	public static final byte MOD = 57;
	public static final byte MTH = 58;
	public static final byte MTL = 59;
	public static final byte NAV = 60;
	public static final byte NEBL = 61;
	public static final byte NEO = 62;
	public static final byte NULS = 63;
	public static final byte OAX = 64;
	public static final byte OMG = 65;
	public static final byte OST = 66;
	public static final byte POE = 67;
	public static final byte POWR = 68;
	public static final byte PPT = 69;
	public static final byte QSP = 70;
	public static final byte QTUM = 71;
	public static final byte RCN = 72;
	public static final byte RDN = 73;
	public static final byte REQ = 74;
	public static final byte SALT = 75;
	public static final byte SNGLS = 76;
	public static final byte SNM = 77;
	public static final byte SNT = 78;
	public static final byte STORJ = 79;
	public static final byte STRAT = 80;
	public static final byte SUB = 81;
	public static final byte TNB = 82;
	public static final byte TNT = 83;
	public static final byte TRIG = 84;
	public static final byte TRX = 85;
	public static final byte VEN = 86;
	public static final byte VIB = 87;
	public static final byte WABI = 88;
	public static final byte WAVES = 89;
	public static final byte WINGS = 90;
	public static final byte WTC = 91;
	public static final byte XLM = 92;
	public static final byte XMR = 93;
	public static final byte XRP = 94;
	public static final byte XVG = 95;
	public static final byte XZC = 96;
	public static final byte YOYO = 97;
	public static final byte ZEC = 98;
	public static final byte ZRX = 99;

	public static final byte[][][] coinId = new byte[26][26][26];

	static {
		coinId['b' - 'a']['t' - 'a']['c' - 'a'] = BTC;
		coinId['b' - 'a']['n' - 'a']['b' - 'a'] = BNB;
		coinId['e' - 'a']['t' - 'a']['h' - 'a'] = ETH;
		coinId['u' - 'a']['s' - 'a']['d' - 'a'] = USDT;
		coinId['a' - 'a']['d' - 'a']['a' - 'a'] = ADA;
		coinId['a' - 'a']['d' - 'a']['x' - 'a'] = ADX;
		coinId['a' - 'a']['i' - 'a']['o' - 'a'] = AION;
		coinId['a' - 'a']['m' - 'a']['b' - 'a'] = AMB;
		coinId['a' - 'a']['r' - 'a']['k' - 'a'] = ARK;
		coinId['a' - 'a']['r' - 'a']['n' - 'a'] = ARN;
		coinId['a' - 'a']['s' - 'a']['t' - 'a'] = AST;
		coinId['b' - 'a']['a' - 'a']['t' - 'a'] = BAT;
		coinId['b' - 'a']['c' - 'a']['c' - 'a'] = BCC;
		coinId['b' - 'a']['c' - 'a']['d' - 'a'] = BCD;
		coinId['b' - 'a']['c' - 'a']['p' - 'a'] = BCPT;
		coinId['b' - 'a']['n' - 'a']['t' - 'a'] = BNT;
		coinId['b' - 'a']['q' - 'a']['x' - 'a'] = BQX;
		coinId['b' - 'a']['r' - 'a']['d' - 'a'] = BRD;
		coinId['b' - 'a']['t' - 'a']['g' - 'a'] = BTG;
		coinId['b' - 'a']['t' - 'a']['s' - 'a'] = BTS;
		coinId['c' - 'a']['d' - 'a']['t' - 'a'] = CDT;
		coinId['c' - 'a']['m' - 'a']['t' - 'a'] = CMT;
		coinId['c' - 'a']['n' - 'a']['d' - 'a'] = CND;
		coinId['c' - 'a']['t' - 'a']['r' - 'a'] = CTR;
		coinId['d' - 'a']['a' - 'a']['s' - 'a'] = DASH;
		coinId['d' - 'a']['g' - 'a']['d' - 'a'] = DGD;
		coinId['d' - 'a']['l' - 'a']['t' - 'a'] = DLT;
		coinId['d' - 'a']['n' - 'a']['t' - 'a'] = DNT;
		coinId['e' - 'a']['d' - 'a']['o' - 'a'] = EDO;
		coinId['e' - 'a']['l' - 'a']['f' - 'a'] = ELF;
		coinId['e' - 'a']['n' - 'a']['g' - 'a'] = ENG;
		coinId['e' - 'a']['n' - 'a']['j' - 'a'] = ENJ;
		coinId['e' - 'a']['o' - 'a']['s' - 'a'] = EOS;
		coinId['e' - 'a']['t' - 'a']['c' - 'a'] = ETC;
		coinId['e' - 'a']['v' - 'a']['x' - 'a'] = EVX;
		coinId['f' - 'a']['u' - 'a']['e' - 'a'] = FUEL;
		coinId['f' - 'a']['u' - 'a']['n' - 'a'] = FUN;
		coinId['g' - 'a']['a' - 'a']['s' - 'a'] = GAS;
		coinId['g' - 'a']['t' - 'a']['o' - 'a'] = GTO;
		coinId['g' - 'a']['v' - 'a']['t' - 'a'] = GVT;
		coinId['g' - 'a']['x' - 'a']['s' - 'a'] = GXS;
		coinId['h' - 'a']['s' - 'a']['r' - 'a'] = HSR;
		coinId['i' - 'a']['c' - 'a']['n' - 'a'] = ICN;
		coinId['i' - 'a']['c' - 'a']['x' - 'a'] = ICX;
		coinId['i' - 'a']['o' - 'a']['t' - 'a'] = IOTA;
		coinId['k' - 'a']['m' - 'a']['d' - 'a'] = KMD;
		coinId['k' - 'a']['n' - 'a']['c' - 'a'] = KNC;
		coinId['l' - 'a']['e' - 'a']['n' - 'a'] = LEND;
		coinId['l' - 'a']['i' - 'a']['n' - 'a'] = LINK;
		coinId['l' - 'a']['r' - 'a']['c' - 'a'] = LRC;
		coinId['l' - 'a']['s' - 'a']['k' - 'a'] = LSK;
		coinId['l' - 'a']['t' - 'a']['c' - 'a'] = LTC;
		coinId['l' - 'a']['u' - 'a']['n' - 'a'] = LUN;
		coinId['m' - 'a']['a' - 'a']['n' - 'a'] = MANA;
		coinId['m' - 'a']['c' - 'a']['o' - 'a'] = MCO;
		coinId['m' - 'a']['d' - 'a']['a' - 'a'] = MDA;
		coinId['m' - 'a']['o' - 'a']['d' - 'a'] = MOD;
		coinId['m' - 'a']['t' - 'a']['h' - 'a'] = MTH;
		coinId['m' - 'a']['t' - 'a']['l' - 'a'] = MTL;
		coinId['n' - 'a']['a' - 'a']['v' - 'a'] = NAV;
		coinId['n' - 'a']['e' - 'a']['b' - 'a'] = NEBL;
		coinId['n' - 'a']['e' - 'a']['o' - 'a'] = NEO;
		coinId['n' - 'a']['u' - 'a']['l' - 'a'] = NULS;
		coinId['o' - 'a']['a' - 'a']['x' - 'a'] = OAX;
		coinId['o' - 'a']['m' - 'a']['g' - 'a'] = OMG;
		coinId['o' - 'a']['s' - 'a']['t' - 'a'] = OST;
		coinId['p' - 'a']['o' - 'a']['e' - 'a'] = POE;
		coinId['p' - 'a']['o' - 'a']['w' - 'a'] = POWR;
		coinId['p' - 'a']['p' - 'a']['t' - 'a'] = PPT;
		coinId['q' - 'a']['s' - 'a']['p' - 'a'] = QSP;
		coinId['q' - 'a']['t' - 'a']['u' - 'a'] = QTUM;
		coinId['r' - 'a']['c' - 'a']['n' - 'a'] = RCN;
		coinId['r' - 'a']['d' - 'a']['n' - 'a'] = RDN;
		coinId['r' - 'a']['e' - 'a']['q' - 'a'] = REQ;
		coinId['s' - 'a']['a' - 'a']['l' - 'a'] = SALT;
		coinId['s' - 'a']['n' - 'a']['g' - 'a'] = SNGLS;
		coinId['s' - 'a']['n' - 'a']['m' - 'a'] = SNM;
		coinId['s' - 'a']['n' - 'a']['t' - 'a'] = SNT;
		coinId['s' - 'a']['t' - 'a']['o' - 'a'] = STORJ;
		coinId['s' - 'a']['t' - 'a']['r' - 'a'] = STRAT;
		coinId['s' - 'a']['u' - 'a']['b' - 'a'] = SUB;
		coinId['t' - 'a']['n' - 'a']['b' - 'a'] = TNB;
		coinId['t' - 'a']['n' - 'a']['t' - 'a'] = TNT;
		coinId['t' - 'a']['r' - 'a']['i' - 'a'] = TRIG;
		coinId['t' - 'a']['r' - 'a']['x' - 'a'] = TRX;
		coinId['v' - 'a']['e' - 'a']['n' - 'a'] = VEN;
		coinId['v' - 'a']['i' - 'a']['b' - 'a'] = VIB;
		coinId['w' - 'a']['a' - 'a']['b' - 'a'] = WABI;
		coinId['w' - 'a']['a' - 'a']['v' - 'a'] = WAVES;
		coinId['w' - 'a']['i' - 'a']['n' - 'a'] = WINGS;
		coinId['w' - 'a']['t' - 'a']['c' - 'a'] = WTC;
		coinId['x' - 'a']['l' - 'a']['m' - 'a'] = XLM;
		coinId['x' - 'a']['m' - 'a']['r' - 'a'] = XMR;
		coinId['x' - 'a']['r' - 'a']['p' - 'a'] = XRP;
		coinId['x' - 'a']['v' - 'a']['g' - 'a'] = XVG;
		coinId['x' - 'a']['z' - 'a']['c' - 'a'] = XZC;
		coinId['y' - 'a']['o' - 'a']['y' - 'a'] = YOYO;
		coinId['z' - 'a']['e' - 'a']['c' - 'a'] = ZEC;
		coinId['z' - 'a']['r' - 'a']['x' - 'a'] = ZRX;
	}

	public static final String[] coinNames = new String[NUMBER + 1];

	static {
		coinNames[BTC] = new String("btc");
		coinNames[BNB] = new String("bnb");
		coinNames[ETH] = new String("eth");
		coinNames[USDT] = new String("usdt");
		coinNames[ADA] = new String("ada");
		coinNames[ADX] = new String("adx");
		coinNames[AION] = new String("aion");
		coinNames[AMB] = new String("amb");
		coinNames[ARK] = new String("ark");
		coinNames[ARN] = new String("arn");
		coinNames[AST] = new String("ast");
		coinNames[BAT] = new String("bat");
		coinNames[BCC] = new String("bcc");
		coinNames[BCD] = new String("bcd");
		coinNames[BCPT] = new String("bcpt");
		coinNames[BNT] = new String("bnt");
		coinNames[BQX] = new String("bqx");
		coinNames[BRD] = new String("brd");
		coinNames[BTG] = new String("btg");
		coinNames[BTS] = new String("bts");
		coinNames[CDT] = new String("cdt");
		coinNames[CMT] = new String("cmt");
		coinNames[CND] = new String("cnd");
		coinNames[CTR] = new String("ctr");
		coinNames[DASH] = new String("dash");
		coinNames[DGD] = new String("dgd");
		coinNames[DLT] = new String("dlt");
		coinNames[DNT] = new String("dnt");
		coinNames[EDO] = new String("edo");
		coinNames[ELF] = new String("elf");
		coinNames[ENG] = new String("eng");
		coinNames[ENJ] = new String("enj");
		coinNames[EOS] = new String("eos");
		coinNames[ETC] = new String("etc");
		coinNames[EVX] = new String("evx");
		coinNames[FUEL] = new String("fuel");
		coinNames[FUN] = new String("fun");
		coinNames[GAS] = new String("gas");
		coinNames[GTO] = new String("gto");
		coinNames[GVT] = new String("gvt");
		coinNames[GXS] = new String("gxs");
		coinNames[HSR] = new String("hsr");
		coinNames[ICN] = new String("icn");
		coinNames[ICX] = new String("icx");
		coinNames[IOTA] = new String("iota");
		coinNames[KMD] = new String("kmd");
		coinNames[KNC] = new String("knc");
		coinNames[LEND] = new String("lend");
		coinNames[LINK] = new String("link");
		coinNames[LRC] = new String("lrc");
		coinNames[LSK] = new String("lsk");
		coinNames[LTC] = new String("ltc");
		coinNames[LUN] = new String("lun");
		coinNames[MANA] = new String("mana");
		coinNames[MCO] = new String("mco");
		coinNames[MDA] = new String("mda");
		coinNames[MOD] = new String("mod");
		coinNames[MTH] = new String("mth");
		coinNames[MTL] = new String("mtl");
		coinNames[NAV] = new String("nav");
		coinNames[NEBL] = new String("nebl");
		coinNames[NEO] = new String("neo");
		coinNames[NULS] = new String("nuls");
		coinNames[OAX] = new String("oax");
		coinNames[OMG] = new String("omg");
		coinNames[OST] = new String("ost");
		coinNames[POE] = new String("poe");
		coinNames[POWR] = new String("powr");
		coinNames[PPT] = new String("ppt");
		coinNames[QSP] = new String("qsp");
		coinNames[QTUM] = new String("qtum");
		coinNames[RCN] = new String("rcn");
		coinNames[RDN] = new String("rdn");
		coinNames[REQ] = new String("req");
		coinNames[SALT] = new String("salt");
		coinNames[SNGLS] = new String("sngls");
		coinNames[SNM] = new String("snm");
		coinNames[SNT] = new String("snt");
		coinNames[STORJ] = new String("storj");
		coinNames[STRAT] = new String("strat");
		coinNames[SUB] = new String("sub");
		coinNames[TNB] = new String("tnb");
		coinNames[TNT] = new String("tnt");
		coinNames[TRIG] = new String("trig");
		coinNames[TRX] = new String("trx");
		coinNames[VEN] = new String("ven");
		coinNames[VIB] = new String("vib");
		coinNames[WABI] = new String("wabi");
		coinNames[WAVES] = new String("waves");
		coinNames[WINGS] = new String("wings");
		coinNames[WTC] = new String("wtc");
		coinNames[XLM] = new String("xlm");
		coinNames[XMR] = new String("xmr");
		coinNames[XRP] = new String("xrp");
		coinNames[XVG] = new String("xvg");
		coinNames[XZC] = new String("xzc");
		coinNames[YOYO] = new String("yoyo");
		coinNames[ZEC] = new String("zec");
		coinNames[ZRX] = new String("zrx");
	}

	public static byte
	stringToId(String coin) {
		byte[] c = coin.getBytes();
		return coinId[ c[0] - 'a' ][ c[1] - 'a' ][ c[2] - 'a' ];
	}
}
