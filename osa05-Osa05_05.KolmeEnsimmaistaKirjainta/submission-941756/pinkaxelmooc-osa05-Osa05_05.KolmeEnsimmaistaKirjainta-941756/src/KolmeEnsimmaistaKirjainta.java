
import java.util.Scanner;

public class KolmeEnsimmaistaKirjainta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        if (nimi.length() < 3) {
            return;
        }
        int indeksi = 0;

        while (indeksi < 3) {
            System.out.println(indeksi + 1 + ". kirjain: " + nimi.charAt(indeksi));
            indeksi++;
        }
    }
}
