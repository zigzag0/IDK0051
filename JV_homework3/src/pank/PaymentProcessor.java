package pank;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PaymentProcessor {

    public void mahaKandmine(ArrayList<Pangakaart> kaardid) {
        for (Pangakaart pangakaart : kaardid) {
            pangakaart.makseTehing(new BigDecimal("3.0454547"));
            pangakaart.kontojaagiTagastus();
        }

    }

}
