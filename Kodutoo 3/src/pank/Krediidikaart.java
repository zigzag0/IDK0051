package pank;

import java.math.BigDecimal;

public class Krediidikaart extends Pangakaart {

	public Krediidikaart() {
		this.saldo = new BigDecimal("20000.0005");
	}

	@Override
	public String toString() {
		return "Krediidikaart [saldo=" + saldo + "]";
	}

}
