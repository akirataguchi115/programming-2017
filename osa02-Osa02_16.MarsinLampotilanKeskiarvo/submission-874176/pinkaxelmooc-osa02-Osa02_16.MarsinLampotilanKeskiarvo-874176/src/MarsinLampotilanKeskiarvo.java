
import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        int kerroin = 0;

        while (true) {
            System.out.println("Syötä mittaus: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku >= -140 && luku <= 20) {
                summa = summa + luku;
                kerroin++;
                continue;
            } else if (luku == 9999) {
                break;
            }
        }
        System.out.println("Mittausten keskiarvo: " + ((double) summa / (double) kerroin));
    }
}
