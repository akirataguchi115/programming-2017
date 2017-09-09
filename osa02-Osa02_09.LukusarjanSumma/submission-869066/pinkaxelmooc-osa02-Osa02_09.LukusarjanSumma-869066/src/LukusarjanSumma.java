
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti? ");
        int asti = Integer.parseInt(lukija.nextLine());
        int kierros = 0;
        int luku = 1;
        int summa = 0;

        while (kierros < asti) {
            summa = summa + luku;
            luku++;
            kierros++;
        }
        System.out.println("Summa on " + summa);
    }
}
