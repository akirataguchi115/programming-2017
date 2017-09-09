
import java.util.Scanner;

public class KelvollistenLukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku: ");
        int kelv = 0;
        int kelvo = 0;
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == 9999) {
                break;
            } else if (luku >= 140 || luku <= -20) {
                System.out.println("Kelvoton luku");
            } else {
                kelv++;

            }
        }
        System.out.println("");
        System.out.println("Kelvollisia lukuja yhteensä: " + kelv);
    }
}
