package pank;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankClientGateway {

    private static ArrayList<Klient> klients = new ArrayList<Klient>();

    public static Klient getKlientById(int idKood) {

        for (Klient klient : klients) {
            if (klient.getIdKood() == idKood) {
                return klient;
            } else {
                Klient newKlient = new Klient();
                newKlient.setIdKood(idKood);
                newKlient.setDebeetKaart(new NFCKaart(new BigDecimal("1000")));
                klients.add(newKlient);
                int curKlientIndexInArray = klients.indexOf(klient);
                int curKlientId = curKlientIndexInArray + 1;
                int mod = curKlientId % 3;
                if (mod == 0) {
                    klients.get(curKlientIndexInArray).setDebeetKaart(
                            new NFCKaart(new BigDecimal("1100")));

                }
            }
        }
        return null;
    }
}
