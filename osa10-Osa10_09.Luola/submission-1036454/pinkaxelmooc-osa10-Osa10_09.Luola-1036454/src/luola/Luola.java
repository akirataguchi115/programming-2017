package luola;

import java.util.Random;
import java.util.Scanner;

public class Luola {

    private int leveys;
    private int korkeus;
    private int hirvioita;
    private int siirtoja;
    private boolean hirviotLiikkuvat;
    private boolean jatka;
    private int[][] taulukko;

    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirviotLiikkuvat) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.hirvioita = hirvioita;
        this.siirtoja = siirtoja;
        this.hirviotLiikkuvat = hirviotLiikkuvat;
        this.jatka = true;
        this.taulukko = new int[leveys][korkeus];

    }

    public void run(Scanner lukija) {
        alkuAsettelu();
        while (jatka) {
            tilanne();
            pelaajaLiiku(lukija);
            paivitys();
            hirvioLiiku();
            paivitys();

        }
    }

    private void alkuAsettelu() {
        taulukko[0][0] = 1; //tarkoittaa että ruudussa on pelaaja
        for (int i = 0; i < hirvioita; i++) {
            Random randomi1 = new Random();
            int luku1 = randomi1.nextInt(leveys + 1);
            Random randomi2 = new Random();
            int luku2 = randomi2.nextInt(korkeus + 1);
            if (taulukko[luku1][luku2] == 1) {
                i--;
            } else {
                taulukko[luku1][luku2] = 2; //tarkoittaa että ruudussa on hirviö
            }
        }
        for (int x = 0; x < leveys; x++) {
            for (int y = 0; y < korkeus; y++) {
                if (taulukko[x][y] != 1 && taulukko[x][y] != 2) {
                    taulukko[x][y] = 0; //tarkoittaa että ruutu on tyhjä toistaiseksi
                }
            }
        }
    }

    private void tilanne() {
        System.out.println(siirtoja + "\n\n");
        for (int x = 0; x < korkeus; x++) {
            for (int y = 0; y < leveys; y++) {
                if (taulukko[x][y] == 0) {
                    System.out.print(".");
                } else if (taulukko[x][y] == 1) {
                    System.out.print("h");
                } else if (taulukko[x][y] == 2) {
                    System.out.print("@");
                }
            } 
            System.out.print("\n");

        }
    }

    public void pelaajaLiiku(Scanner lukija) {

    }

    public void paivitys() {

    }

    public void hirvioLiiku() {

    }

}
