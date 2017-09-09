
import java.util.ArrayList;
import java.util.Scanner;

public class Hirsipuu {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä merkkijonoa arvataan? ");
        String arvattava = lukija.nextLine();
        String uusiarvaus;

        Peli peli = new Peli(arvattava);
        peli.alustaListat(arvattava);
        System.out.println(peli.annaSanaMaskattuna());
        System.out.println(peli.Arvaustenmaara());
        System.out.println(peli.arvaukset());
        System.out.print("Arvaus: ");
        peli.paivitys(uusiarvaus = lukija.nextLine());

        while (peli.elamat() == true) {
            peli.alustaListat(arvattava);
            System.out.println(peli.annaSanaMaskattuna());
            System.out.println(peli.Arvaustenmaara());
            System.out.println(peli.arvaukset());
            System.out.print("Arvaus: ");
            peli.paivitys(uusiarvaus = lukija.nextLine());
        } if(peli.elamat() == false) {
            System.out.println("Hävisit!");
        } else {
            System.out.println("Voitit!");
        }
    }
}
