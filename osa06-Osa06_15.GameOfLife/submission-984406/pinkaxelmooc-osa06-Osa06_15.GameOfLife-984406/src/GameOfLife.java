
import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];

        for (int x = 0; x < taulukko.length; x++) {
            for (int y = 0; y < taulukko[0].length; y++) {
                if (taulukko[x][y] == 1) {
                    kopio[x][y] = 1;
                } else if (taulukko[x][y] == 0) {
                    kopio[x][y] = 0;
                }
                if (this.elossaOleviaNaapureita(taulukko, x, y) < 2) { //1.sääntö
                    kopio[x][y] = 0;
                } else if (this.elossaOleviaNaapureita(taulukko, x, y) == 2 || this.elossaOleviaNaapureita(taulukko, x, y) == 3) {
                    kopio[x][y] = 1; //2. ja 4. sääntö
                } else if (this.elossaOleviaNaapureita(taulukko, x, y) >= 4) {
                    kopio[x][y] = 0; //3. sääntö
                }
            }
        }
        this.taulukko = kopio;
    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int lkm = 0;
        for (int u = -1; u <= 1; u++) {
            for (int v = -1; v <= 1; v++) {
                if (u == 0 && v == 0) {
                    // oma solu -> do nothing
                } else {
                    try {
                        if (taulukko[x + u][y + v] == 1) {
                            lkm++;
                        }

                    } catch (IndexOutOfBoundsException e) {
                        // hähää oltiin reunassa, mutta ei anneta häiritä
                    }
                }
            }
        }
        return lkm;
    }
}
