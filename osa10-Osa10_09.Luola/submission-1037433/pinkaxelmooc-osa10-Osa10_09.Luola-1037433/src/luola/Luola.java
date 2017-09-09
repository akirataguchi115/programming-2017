package luola;

import java.util.ArrayList;
import java.util.List;
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
    private Pelaaja pelaaja;
    private List<Hirvio> hirviot;
    private List<Piste> pelaajaPisteet;

    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirviotLiikkuvat) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.hirvioita = hirvioita;
        this.siirtoja = siirtoja;
        this.hirviotLiikkuvat = hirviotLiikkuvat;
        this.jatka = true;
        this.taulukko = new int[leveys][korkeus];
        this.pelaaja = new Pelaaja(this.taulukko);
        this.hirviot = new ArrayList<>();
        this.pelaajaPisteet = new ArrayList<>();
    }

    public void run(Scanner lukija) {
        alkuAsettelu();
        while (jatka) {
            tilanne();
            pelaajaLiiku(lukija);
            jatka = paivitys();
            if (hirviotLiikkuvat) {
                hirvioLiiku();
                paivitys();
            }
            siirtoja--;
            if (siirtoja == 0) {
                jatka = false;
            }
        }
        if (hirvioita == 0) {
            System.out.println("VOITIT");
        }
        System.out.println("HÄVISIT");
    }

    public void alkuAsettelu() {
        for (int i = 0; i < leveys; i++) {
            for (int u = 0; u < korkeus; u++) {
                taulukko[i][u] = 0; //kaikki ruudut tyhjiksi
            }
        }
        taulukko[0][0] = 1; //pelaaja aloittaa nollasta
        Random randomi = new Random();
        for (int i = 0; i < hirvioita; i++) {
            int luku1 = randomi.nextInt(leveys);
            int luku2 = randomi.nextInt(korkeus);
            taulukko[luku1][luku2] = 2; //asetetaan satunnaiset hirviöt
            hirviot.add(new Hirvio(luku1, luku2, taulukko));
        }
    }

    public void tilanne() {
        System.out.println(siirtoja + "\n");
        System.out.println("@ " + pelaaja.getLeveys() + " " + pelaaja.getKorkeus());
        for (int u = 0; u < hirviot.size(); u++) {
            System.out.println("h " + hirviot.get(u).getLeveys() + " " + hirviot.get(u).getKorkeus());

        }
        System.out.print("\n");

        
        for (int i = 0; i < leveys; i++) {
            for (int u = 0; u < korkeus; u++) {
                if (taulukko[i][u] == 0) {
                    System.out.print(".");
                } else if (taulukko[i][u] == 1) {
                    System.out.print("@");
                } else if (taulukko[i][u] == 2) {
                    System.out.print("h");
                }
            }
            System.out.print("\n");

        }
    }

    public void pelaajaLiiku(Scanner lukija) { //pelaaja liikkuu varoen IOoBe
        pelaajaPisteet.clear();
        String komento = lukija.nextLine();
        boolean viela = true;
        for (int i = 0; i < komento.length(); i++) {
            if (komento.charAt(i) == 'd') {
                if (pelaaja.getKorkeus() + 1 >= korkeus) {
                    continue;
                }
                pelaaja.liiku(0, 1);
                pelaajaPisteet.add(new Piste(pelaaja.getLeveys(), pelaaja.getKorkeus()));
            } else if (komento.charAt(i) == 'a') {
                if (pelaaja.getKorkeus() - 1 < 0) {
                    continue;
                }
                pelaaja.liiku(0, -1);
                pelaajaPisteet.add(new Piste(pelaaja.getLeveys(), pelaaja.getKorkeus()));
            } else if (komento.charAt(i) == 'w') {
                if (pelaaja.getLeveys() - 1 < 0) {
                    continue;
                }
                pelaaja.liiku(-1, 0);
                pelaajaPisteet.add(new Piste(pelaaja.getLeveys(), pelaaja.getKorkeus()));
            } else if (komento.charAt(i) == 's') {
                if (pelaaja.getLeveys() + 1 >= leveys) {
                    continue;
                }
                pelaaja.liiku(1, 0);
                pelaajaPisteet.add(new Piste(pelaaja.getLeveys(), pelaaja.getKorkeus()));
            }
        }
    }

    public boolean paivitys() { //päivitetään taulukko ja tapetaan hirviöt
        for (int y = 0; y < leveys; y++) {
            for (int t = 0; t < korkeus; t++) {
                if (taulukko[y][t] == 1) {
                    taulukko[y][t] = 0;
                }
            }
        }
        taulukko[pelaaja.getLeveys()][pelaaja.getKorkeus()] = 1;
        for (int i = 0; i < pelaajaPisteet.size(); i++) {
            if (taulukko[pelaajaPisteet.get(i).getLeveys()][pelaajaPisteet.get(i).getKorkeus()] == 2) {
                taulukko[pelaajaPisteet.get(i).getLeveys()][pelaajaPisteet.get(i).getKorkeus()] = 0;
                hirvioita--;
                for (int u = 0; u < hirviot.size(); u++) {
                    if (hirviot.get(u).getKorkeus() == pelaajaPisteet.get(i).getKorkeus() && hirviot.get(u).getLeveys() == pelaajaPisteet.get(i).getLeveys()) {
                        hirviot.remove(u);
                    }
                }
            }
        }
        return hirvioita != 0;
    }

    public void hirvioLiiku() {

    }
}
