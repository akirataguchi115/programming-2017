
public class Kirja {

    private String nimi;
    private int sivu;
    private int julkasu;

    public Kirja(String nimi, int sivu, int julkasu) {
        this.nimi = nimi;
        this.sivu = sivu;
        this.julkasu = julkasu;
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getSivu() {
        return this.sivu;
    }

    public int getJulkasu() {
        return this.julkasu;
    }

    @Override
    public String toString() {
        return "" + this.nimi + ", " + this.sivu + ", " + this.julkasu;
    }

}
