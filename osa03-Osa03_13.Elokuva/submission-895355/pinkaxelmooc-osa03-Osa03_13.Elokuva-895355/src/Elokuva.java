
public class Elokuva {

    private String nimi;
    private int ikaraja;

    public Elokuva(String elokuvanNimi, int elokuvanIkaraja) {
        this.nimi = elokuvanNimi;
        this.ikaraja = elokuvanIkaraja;
    }

    public String nimi() {
        return this.nimi;

    }

    public int ikaraja() {
        return this.ikaraja;
    }
}
