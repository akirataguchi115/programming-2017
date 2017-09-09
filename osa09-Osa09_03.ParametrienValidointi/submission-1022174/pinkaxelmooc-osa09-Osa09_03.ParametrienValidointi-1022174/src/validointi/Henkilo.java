package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {

        this.nimi = nimi;
        this.ika = ika;
        if (nimi == null) {
            throw new IllegalArgumentException();
        }
        if (nimi.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (nimi.length() > 40) {
            throw new IllegalArgumentException();
        }

        if (ika > 120 || ika < 0) {
            throw new IllegalArgumentException();
        }
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
