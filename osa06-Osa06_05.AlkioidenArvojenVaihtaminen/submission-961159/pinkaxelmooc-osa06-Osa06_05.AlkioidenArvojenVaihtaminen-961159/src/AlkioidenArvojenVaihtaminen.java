
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AlkioidenArvojenVaihtaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[5];
        taulukko[0] = 1;
        taulukko[1] = 3;
        taulukko[2] = 5;
        taulukko[3] = 7;
        taulukko[4] = 9;

        int indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
        System.out.println("");

        System.out.println("Mitkä indeksit vaihdetaa? ");
        int eka = Integer.parseInt(lukija.nextLine());
        int toka = Integer.parseInt(lukija.nextLine());
        int ek = taulukko[eka];
        int tok = taulukko[toka];

        taulukko[eka] = tok;
        taulukko[toka] = ek;

        // Toteuta indeksien kysyminen ja vaihto tänne
        System.out.println("");
        indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
    }

}
