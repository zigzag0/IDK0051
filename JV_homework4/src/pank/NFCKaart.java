package pank;

import java.math.BigDecimal;

public class NFCKaart extends Pangakaart {

    private BigDecimal nfcLimiit = new BigDecimal("150");

    public NFCKaart(BigDecimal saldo) {
        super();
    }

    public NFCKaart() {
        super();
        // TODO Auto-generated constructor stub
    }

    public BigDecimal pisiMakse(BigDecimal valjaMakse) {

        if (valjaMakse.compareTo(nfcLimiit) <= 0) {
            if (valjaMakse.compareTo(new BigDecimal("20")) <= 0) {
                if (super.makseTehing(valjaMakse)) {
                    nfcLimiit = nfcLimiit.subtract(valjaMakse);
                    System.out.println(nfcLimiit);
                }
            } else {
                System.out
                        .println("NFC kaart ei luba maha votta rohkem kui 20 eurot.");
            }

        } else {

            System.out.println("Limiit NFC kaardil on loppetatud");

        }
        return saldo;

    }

    @Override
    public String toString() {
        return "NFCKaart [saldo=" + saldo + ", vabadVahendid=" + vabadVahendid
                + ", liimit=" + liimit + "]";
    }

}
