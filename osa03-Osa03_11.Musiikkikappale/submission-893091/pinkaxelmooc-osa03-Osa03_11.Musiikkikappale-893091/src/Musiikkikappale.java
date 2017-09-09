
public class Musiikkikappale {
    private String nimi;
    private int pituus;
    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus) {
        this.nimi = kappaleenNimi;
        this.pituus = kappaleenPituus;
    } public String nimi() {
        return this.nimi;
    } public int pituus() {
        return this.pituus;
    }
}
