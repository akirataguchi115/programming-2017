package hiekkaranta;

public class Simulaatio {

    private int leveys;
    private int korkeus;
    private Tyyppi[][] taulukko;

    public Simulaatio(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.taulukko = new Tyyppi[leveys][korkeus];
    }

    public void lisaa(int x, int y, Tyyppi tyyppi) {
        taulukko[x][y] = tyyppi;
    }

    public Tyyppi sisalto(int x, int y) {
        if (x >= this.leveys || y >= this.korkeus) {
            return Tyyppi.METALLI;
        } else if (x <= 0 || y <= 0) {
            return Tyyppi.METALLI;
        }
        if (taulukko[x][y] == null) {
            return Tyyppi.TYHJA;
        }

        return taulukko[x][y];
    }

    public void paivita() {
        for (int x = 0; x < leveys; x++) {
            for (int y = 0; y < korkeus; y++) {
                if (taulukko[x][y] == Tyyppi.HIEKKA) {
                    if (taulukko[x][y - 1] == Tyyppi.TYHJA) {
                        taulukko[x][y] = Tyyppi.TYHJA;
                        taulukko[x][y - 1] = Tyyppi.HIEKKA;
                    } else if (taulukko[x][y - 2] == Tyyppi.TYHJA) {
                        taulukko[x][y] = Tyyppi.TYHJA;
                        taulukko[x][y - 2] = Tyyppi.HIEKKA;
                    } else if (taulukko[x][y - 3] == Tyyppi.TYHJA) {
                        taulukko[x][y] = Tyyppi.TYHJA;
                        taulukko[x][y - 3] = Tyyppi.HIEKKA;
                    }
                }
            }
        }
    }

}
