
import java.util.Scanner;

public class NimenKaantaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        int indeksi = nimi.length() - 1;

        while (indeksi >= 0) {
            System.out.print(nimi.charAt(indeksi));
            indeksi--;
        } 

        // Tee koodisi tänne
    }
}
