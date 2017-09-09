package luola;

public class Pelaaja {

    private int leveys;
    private int korkeus;
    private int[][] taulukko;

    public Pelaaja(int taulukko[][]) {
        this.leveys = 0;
        this.korkeus = 0;
        this.taulukko = taulukko;
    }

    public int getLeveys() {
        return leveys;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public void liiku(int leveys, int korkeus) {
        this.leveys += leveys;
        this.korkeus += korkeus;
    }
}
