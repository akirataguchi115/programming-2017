package sovellus;

import java.util.Random;

public class Peliruudukko {

    private int[][] taulukko;

    public Peliruudukko() {
        this.taulukko = new int[4][4];
        taulukko[0][0] = 1;
        for (int i = 1; i < 4; i++) {
            for (int u = 0; u < 4; u++) {
                taulukko[u][i] = 0;
            }
        }
    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public boolean siirtoSallittu(String n, int y, int x) { //sovelletaan siirtologiikassa
        if (n.equals("o")) {
            if (x == 3) {
                return false;
            }
            return taulukko[y][x + 1] == 0;
        } else if (n.equals("v")) {
            if (x == 0) {
                return false;
            }
            return taulukko[y][x - 1] == 0;
        } else if (n.equals("y")) {
            if (y == 0) {
                return false;
            }
            return taulukko[y - 1][x] == 0;
        } else if (n.equals("a")) {
            if (y == 3) {
                return false;
            }
            return taulukko[y + 1][x] == 0;
        }
        return false;
    }

    public void siirraOikealle() {
        for (int i = 3; i >= 0; i--) { //ensimmäinen siirto
            for (int u = 3; u >= 0; u--) {
                if (siirtoSallittu("o", i, u)) {
                    taulukko[i][u + 1] = taulukko[i][u];
                    taulukko[i][u] = 0;
                }
            }
            for (int u = 3; u >= 0; u--) { //toinen siirto
                if (siirtoSallittu("o", i, u)) {
                    taulukko[i][u + 1] = taulukko[i][u];
                    taulukko[i][u] = 0;
                }
            }
            for (int u = 3; u >= 0; u--) { //kolmas siirto
                if (siirtoSallittu("o", i, u)) {
                    taulukko[i][u + 1] = taulukko[i][u];
                    taulukko[i][u] = 0;
                }
            }
            for (int u = 3; u >= 0; u--) { //merge
                if (u != 0) {
                    if (taulukko[i][u] == taulukko[i][u - 1]) {
                        taulukko[i][u] = taulukko[i][u] * 2;
                        taulukko[i][u - 1] = 0;
                    }
                }
            }
            for (int u = 3; u >= 0; u--) { //kolmasvika varmistus siirto
                if (siirtoSallittu("o", i, u)) {
                    taulukko[i][u + 1] = taulukko[i][u];
                    taulukko[i][u] = 0;
                }
            }
            for (int u = 3; u >= 0; u--) { //merge
                if (u != 0) {
                    if (taulukko[i][u] == taulukko[i][u - 1]) {
                        taulukko[i][u] = taulukko[i][u] * 2;
                        taulukko[i][u - 1] = 0;
                    }
                }
            }
            for (int u = 3; u >= 0; u--) { //tokavika varmistus siirto
                if (siirtoSallittu("o", i, u)) {
                    taulukko[i][u + 1] = taulukko[i][u];
                    taulukko[i][u] = 0;
                }
            }
            for (int u = 3; u >= 0; u--) { //merge
                if (u != 0) {
                    if (taulukko[i][u] == taulukko[i][u - 1]) {
                        taulukko[i][u] = taulukko[i][u] * 2;
                        taulukko[i][u - 1] = 0;
                    }
                }
            }
            for (int u = 3; u >= 0; u--) { //vika varmistus siirto
                if (siirtoSallittu("o", i, u)) {
                    taulukko[i][u + 1] = taulukko[i][u];
                    taulukko[i][u] = 0;
                }
            }
        }
        //muista käyttää siirtosallittua
        //u can do it
    }

    public boolean peliKaynnissa() {
        for (int e = 0; e < 4; e++) {
            for (int w = 0; w < 4; w++) {
                if (taulukko[e][w] == 0) {
                    return true;
                }
            } //tarkastetaan onko nollia enää; tällöin true
        }

        for (int i = 0; i < 3; i++) {
            for (int u = 0; u < 3; u++) {
                if (taulukko[i][u] == taulukko[i + 1][u]) {
                    return true;
                }
                if (taulukko[i][u] == taulukko[i][u + 1]) {
                    return true; //tarkastetaan parit
                }
            }
        }
        return false;
    }

    public void siirraYlos() {

    }

    public void siirraAlas() {
    }

    public void siirraVasemmalle() {

    }

    public void arvoUusi() {
        Random random = new Random();
        boolean jatka = true;
        int eka = 0;
        int toka = 0;
        while (jatka) {
            eka = random.nextInt(4);
            toka = random.nextInt(4);
            if (taulukko[eka][toka] == 0) {
                jatka = false;
            }
        }
        taulukko[eka][toka] = 1;
    }
}
