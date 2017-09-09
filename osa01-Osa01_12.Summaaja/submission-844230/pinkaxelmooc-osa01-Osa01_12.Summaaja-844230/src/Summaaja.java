
import java.util.Scanner;

public class Summaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        int summa = eka + toka;
        System.out.println("Lukujen summa: " + summa);
        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
    }
}
