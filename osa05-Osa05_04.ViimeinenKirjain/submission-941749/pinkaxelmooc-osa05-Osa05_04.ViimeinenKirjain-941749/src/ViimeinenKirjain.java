
import java.util.Scanner;

public class ViimeinenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        char kirjain = nimi.charAt(nimi.length() - 1);
        System.out.println("Viimeinen kirjain: " + kirjain);

    }
}
