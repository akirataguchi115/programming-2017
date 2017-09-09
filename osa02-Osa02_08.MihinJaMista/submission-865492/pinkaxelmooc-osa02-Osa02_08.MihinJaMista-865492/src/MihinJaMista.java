
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti? ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Mistä lähtien? ");
        int toka = Integer.parseInt(lukija.nextLine());
        while (toka <= eka) {

            System.out.println(toka);
            toka++;
            if (toka > eka) {
                break;
            }
        }
    }// KIRJOITA OHJELMASI TÄNNE
}
