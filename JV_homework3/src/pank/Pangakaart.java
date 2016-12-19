package pank;

import java.math.BigDecimal;

public class Pangakaart implements PangakaardiLiides {

    protected BigDecimal saldo = new BigDecimal("10000.0005");
    protected BigDecimal vabadVahendid = saldo;
    protected BigDecimal liimit = new BigDecimal("0");

    public Pangakaart(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Pangakaart() {
    }

    @Override
    public BigDecimal kontojaagiTagastus() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Vabad Vahendid: " + vabadVahendid);
        System.out.println();
        return saldo;
    }

    @Override
    public boolean makseTehing(BigDecimal valjaMakse) {
        System.out.println(this);
        System.out.println("Trying to withdraw: " + valjaMakse);
        if (vabadVahendid.subtract(valjaMakse).compareTo(liimit.negate()) >= 0) {
            System.out.println("Valjamakse: " + valjaMakse);
            saldo = saldo.subtract(valjaMakse);
            vabadVahendid = vabadVahendid.subtract(valjaMakse);
            return true;
        } else {
            System.out.println("Saate maha votta ainult " + vabadVahendid
                    + " Euro.");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pangakaart [saldo=" + saldo + "]";
    }
}
