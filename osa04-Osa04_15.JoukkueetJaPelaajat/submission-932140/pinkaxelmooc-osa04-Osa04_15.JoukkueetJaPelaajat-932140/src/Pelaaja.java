
public class Pelaaja {

    private String nimi;
    private int maalit;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }

    public Pelaaja(String nimi, int maalit) {
        this.nimi = nimi;
        this.maalit = maalit;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public int maalit() {
        return this.maalit;
    }

    public String toString() {
        return ""+ this.nimi + ", " + "maaleja " + this.maalit;
    }
}
