
public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimiAlussa) {
        this.nimi = nimiAlussa;

    }

    public void vanhene() {
        this.ika = this.ika + 1;
    }

    public void tulostaHenkilo() {
        System.out.println(this.nimi + ", ikä " + this.ika + " vuotta");
    }

    public int palautaIka() {
        return this.ika;
    }
}
