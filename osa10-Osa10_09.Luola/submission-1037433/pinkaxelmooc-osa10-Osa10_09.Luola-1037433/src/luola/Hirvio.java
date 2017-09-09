package luola;

public class Hirvio extends Pelaaja {

    private int leveys;
    private int korkeus;

    public Hirvio(int leveys, int korkeus, int[][] taulukko) {
        super(taulukko);
        this.leveys = leveys;
        this.korkeus = korkeus;
    }

    public void liiku() {

    } 

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }
    
    
}
