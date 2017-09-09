
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kirjoita merkkijono: ");
        String jono = lukija.nextLine();

        if (jono.equals("totta")) {
            System.out.println("Oikein meni!");
        } else if (!(jono.equals("totta"))) {
            System.out.println("Koitappa uudelleen!");
        }
    }
}
