
import java.util.ArrayList;
import java.util.Scanner;

public class Hirsipuu {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä merkkijonoa arvataan? ");
        String arvattava = lukija.nextLine();
        String uusiarvaus;

        Peli peli = new Peli(arvattava);
        do {
            System.out.println(peli.annaSanaMaskattuna());
            System.out.println(peli.Arvaustenmaara());
            System.out.println("Arvatut: "+peli.arvaukset());
            System.out.print("Arvaus: ");
            peli.paivitys(uusiarvaus = lukija.nextLine());
            peli.vanhaSana(uusiarvaus);
        } while (peli.elamat() && !peli.voitit() == true);
        if (peli.elamat() == false) {
            System.out.println("Hävisit!");
        } else {
            System.out.println("Voitit!");
        }
    }
}
