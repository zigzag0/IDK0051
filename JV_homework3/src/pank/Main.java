package pank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Pangakaart pk1 = new Pangakaart();
        // pk1.makseTehing(new BigDecimal("25"));
        // pk1.kontojaagiTagastus();
        // // pk1.kontojaagiTagastus(new GregorianCalendar());
        //
        // Krediitkaart kk1 = new Krediitkaart();
        // kk1.makseTehing(new BigDecimal("800"));
        // kk1.kontojaagiTagastus();
        // kk1.kontojaagiTagastus(new GregorianCalendar());
        //
        // Pangakaart pk2 = new Krediitkaart();
        // pk2.makseTehing(new BigDecimal("25"));
        // pk2.kontojaagiTagastus();
        // ((Krediitkaart) pk2).kontojaagiTagastus(new GregorianCalendar());
        //
        // Pangakaart pk3 = new Pangakaart(new BigDecimal("2"));
        // pk3.makseTehing(new BigDecimal("25"));
        // pk3.kontojaagiTagastus();

        NFCKaart nfck1 = new NFCKaart();
        for (int i = 0; i < 10; i++) {
            nfck1.pisiMakse(new BigDecimal("20"));
        }
        nfck1.makseTehing(new BigDecimal("2000"));
        nfck1.kontojaagiTagastus();

        // ArrayList<Pangakaart> kaardid = new ArrayList<>();
        // kaardid.add(pk1);
        // kaardid.add(pk2);
        // kaardid.add(kk1);
        // kaardid.add(pk3);
        // PaymentProcessor proc1 = new PaymentProcessor();
        //
        // System.out.println("*************PaymentProcessor***********");
        // proc1.mahaKandmine(kaardid);

    }
}
