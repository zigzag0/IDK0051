package pank;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		Pangakaart pk1 = new Pangakaart();
		// System.out.println(pk1.kontoJaak());
		pk1.makseTehing(new BigDecimal("25"));
		pk1.kontoJaak();

		Krediidikaart kk1 = new Krediidikaart();
		// System.out.println(kk1.kontoJaak());
		kk1.makseTehing(new BigDecimal("35"));
		kk1.kontoJaak();

		Pangakaart pk2 = new Krediidikaart();
		pk2.makseTehing(new BigDecimal("25"));
		pk2.kontoJaak();
		// kreditka eto kartochka no ne vsjakaja kartochka kreditka
	}

}
