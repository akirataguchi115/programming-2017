
import java.util.Scanner;

public class KelvollistenLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        while (true) {

            System.out.println("Syötä luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku <= 20 && luku >= -140) {
                summa = summa + luku;
                continue;
            } else if (luku == 9999) {
                break;
            } else if (luku > 20 || luku < -140) {
                System.out.println("Kelvoton luku");
            }
        }
        System.out.println("Kelvollisten lukujen summa: " + summa);
    }
}
