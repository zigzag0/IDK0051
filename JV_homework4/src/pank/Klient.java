package pank;

public class Klient {

    private int idKood;
    private NFCKaart deebetKaart;
    private Krediitkaart krediitKaart;

    public int getIdKood() {
        return idKood;
    }

    public void setIdKood(int idKood) {
        this.idKood = idKood;
    }

    public Pangakaart getPangaKaart() {
        return deebetKaart;
    }

    public void setDebeetKaart(NFCKaart deebetKaart) {
        this.deebetKaart = deebetKaart;
    }

    public Krediitkaart getKrediitKaart() {
        return krediitKaart;
    }

    public void setKrediitKaart(Krediitkaart krediitKaart) {
        this.krediitKaart = krediitKaart;
    }

}
