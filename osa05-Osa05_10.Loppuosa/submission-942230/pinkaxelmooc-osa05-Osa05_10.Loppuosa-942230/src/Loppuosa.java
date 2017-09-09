
import java.util.Scanner;

public class Loppuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.println("Loppuosan pituus: ");
        int pituus = Integer.parseInt(lukija.nextLine());
        if(pituus > sana.length()) {
            return;
        }

        String loppuosa = sana.substring(sana.length() - pituus);
        System.out.println("Tulos: " + loppuosa);
    }
}
