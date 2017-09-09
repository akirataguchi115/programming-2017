
import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        int indeksi = 0;
        while (indeksi < nimi.length()) {
            System.out.println(indeksi + 1 + ". kirjain: " + nimi.charAt(indeksi));
            indeksi++;
        }
    }
}
