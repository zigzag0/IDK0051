package pank;

import java.math.BigDecimal;
import java.util.Calendar;

public class Krediitkaart extends Pangakaart {

    public Krediitkaart() {
        // super();
        this.liimit = new BigDecimal("700");
        this.saldo = new BigDecimal("300.453");
        this.vabadVahendid = this.saldo.add(this.liimit);

    }

    public BigDecimal kontojaagiTagastus(Calendar cal) {
        System.out.println("Saldo kuupaevaks 14 marts: " + saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return "Krediitkaart [saldo=" + saldo + "]";
    }

}
