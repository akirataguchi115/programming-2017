
import java.util.Scanner;

public class UseammanLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        System.out.println("Anna lukuja, nolla lopettaa: ");
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == 0) {
                break;
            } else {
                summa = summa + luettu;
            }
            // TEE JOTAIN TÄÄLLÄ
        }

        System.out.println("Summa lopussa: " + summa);
    }
}