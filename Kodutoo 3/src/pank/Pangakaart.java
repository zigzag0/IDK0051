package pank;

import java.math.BigDecimal;

public class Pangakaart implements PangakaardiLiides {

	protected BigDecimal saldo;

	public Pangakaart() {
		this.saldo = new BigDecimal("10000.0005");
	}

	public Pangakaart(BigDecimal saldo) {
		System.out.println("Saldo: " + saldo);
		this.saldo = saldo;
	}

	@Override
	public BigDecimal kontoJaak() {
		System.out.println("Jaak on: " + saldo);
		return saldo;
	}

	@Override
	public BigDecimal makseTehing(BigDecimal valjamakse) {
		System.out.println(this);
		System.out.println("Maksan Valja: " + " " + valjamakse);
		saldo = saldo.subtract(valjamakse);
		return saldo;

	}

	@Override
	public String toString() {
		return "Pangakaart [saldo=" + saldo + "]";
	}

}
