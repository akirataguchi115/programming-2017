
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.println("Anna salasana: ");
        String sana = lukija.nextLine();

        if (tunnus.equals("aleksi") && sana.equals("tappara")) {
            System.out.println("Hei aleksi, olet kirjautunut järjestelmään");
        } else if (tunnus.equals("elina") && sana.equals("kissa")) {
            System.out.println("Hei elina, olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
