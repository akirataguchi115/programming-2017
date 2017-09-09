
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int summa = luku;
        System.out.println("Viimeinen: ");
        int asti = Integer.parseInt(lukija.nextLine());
        int kierros = luku;
        while (kierros < asti) {
            luku++;
            summa = summa + luku;
            kierros++;
        }
        System.out.println("Summa on " + summa);
    }
}
