package sovellus;

import java.util.Scanner;

public class Peli {

    public static void main(String[] args) {

        Peliruudukko peli = new Peliruudukko();
        Scanner lukija = new Scanner(System.in);
        boolean loppu = true;
        while (peli.peliKaynnissa() && loppu) {
            for (int i = 0; i < 4; i++) {
                for (int u = 0; u < 4; u++) {
                    System.out.print(peli.getTaulukko()[i][u] + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n> ");
            String kasky = lukija.nextLine();
            if (kasky.equals("o")) {
                peli.siirraOikealle();
            } else if (kasky.equals("y")) {
                peli.siirraYlos();
            } else if (kasky.equals("a")) {
                peli.siirraAlas();
            } else if (kasky.equals("v")) {
                peli.siirraVasemmalle();
            } else if (kasky.equals("x")) {
                loppu = false;
            }
            
            peli.arvoUusi();
        }
    }
}
