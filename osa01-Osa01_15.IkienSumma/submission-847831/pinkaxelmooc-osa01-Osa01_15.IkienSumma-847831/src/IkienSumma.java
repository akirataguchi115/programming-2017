
import java.util.Scanner;

public class IkienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kerro nimi: ");
        String nimi1 = lukija.nextLine();
        System.out.println("Kerro ikä");
        int ika1 = Integer.parseInt(lukija.nextLine());
        System.out.println("Kerro nimi: ");
        String nimi2 = lukija.nextLine();
        System.out.println("Kerro ikä");
        int ika2 = Integer.parseInt(lukija.nextLine());
        System.out.println(nimi1 + " ja " + nimi2 + " ovat yhteensä " + (ika1 + ika2) + " vuotta vanhoja.");
        // Toteuta ohjelmasi tähän.
    }
}
