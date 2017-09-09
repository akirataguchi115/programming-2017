
import java.util.Scanner;

public class RoundRobin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[5];
        taulukko[0] = 1;
        taulukko[1] = 3;
        taulukko[2] = 5;
        taulukko[3] = 7;
        taulukko[4] = 9;

        while (true) {
            String komento = lukija.nextLine();

            if (komento.equals("lopeta")) {
                break;
            }

            if (komento.equals("tulosta")) {
                int indeksi = 0;
                while (indeksi < taulukko.length) {
                    System.out.print(taulukko[indeksi] + " ");
                    indeksi++;
                }
                System.out.println("");
            }

            if (komento.equals("siirra")) {
                int vika = taulukko[0];
                int indeksi = 0;
                while (indeksi < taulukko.length - 1) {
                    taulukko[indeksi] = taulukko[indeksi + 1];
                    indeksi++;
                }
                taulukko[4] = vika;
                

                // toteuta siirtotoiminnallisuus tänne
            }
        }

    }
}
