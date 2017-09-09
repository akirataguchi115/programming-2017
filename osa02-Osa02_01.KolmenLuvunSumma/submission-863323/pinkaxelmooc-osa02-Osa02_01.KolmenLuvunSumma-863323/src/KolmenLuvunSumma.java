
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        
        System.out.println("Anna ensimmäinen luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kolmas luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija ja summa !
        System.out.println("Summa: " + summa);
    }
}
