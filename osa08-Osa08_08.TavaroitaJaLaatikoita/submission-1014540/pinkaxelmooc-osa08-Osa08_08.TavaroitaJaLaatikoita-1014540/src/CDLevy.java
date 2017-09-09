
public class CDLevy implements Talletettava {

    private String artisti;
    private String nimi;
    private int julkaisuvuosi;

    public CDLevy(String artisti, String nimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    @Override
    public double paino() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artisti + ": " + nimi + " (" + julkaisuvuosi + ")";
    }

}
