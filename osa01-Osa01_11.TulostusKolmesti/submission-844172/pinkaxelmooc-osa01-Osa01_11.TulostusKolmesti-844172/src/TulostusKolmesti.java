
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä tulostetaan?");
        String sesana = lukija.nextLine();
        System.out.println(sesana + sesana + sesana);// Toteuta ohjelmasi tähän.
    }
}
