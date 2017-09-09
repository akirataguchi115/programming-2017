package lentokentta;

import java.util.Scanner;
import lentokentta.lentokenttaohjelmat.Lentokentta;
import lentokentta.lentokenttaohjelmat.Lentopalvelut;
import lentokentta.lentokenttaohjelmat.tervehtija;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        boolean jatka = true;
        tervehtija palvelu = new tervehtija();
        Lentokentta kentta = new Lentokentta();
        Lentopalvelut palvelut = new Lentopalvelut();

        palvelu.tervehdi1();    //ensimmäinen osio
        while (jatka) {
            palvelu.vaihtoehdot1();
            String kasky = lukija.nextLine();
            if (kasky.equals("x")) {
                jatka = false;
                continue;
            }
            if (kasky.equals("1")) {
                System.out.print("Anna lentokoneen tunnus: ");
                String tunnus = lukija.nextLine();
                System.out.print("Anna lentokoneen kapasiteetti: ");
                int kapasiteetti = Integer.parseInt(lukija.nextLine());
                kentta.lisaakone(tunnus, kapasiteetti);
            }
            if (kasky.equals("2")) {
                String matka = "";
                System.out.println("Anna lentokoneen tunnus: ");
                String tunnus = lukija.nextLine();
                System.out.println("Anna lähtöpaikan tunnus: ");
                matka += lukija.nextLine();
                System.out.println("Anna kohdepaikan tunnus: ");
                matka += lukija.nextLine();
                kentta.lisaalento(tunnus, matka);
            }
        }
        jatka = true;
        System.out.println("");

        palvelu.tervehdi2();    //toinen osio
        while (jatka) {
            palvelu.vaihtoehdot2();
            String kasky = lukija.nextLine();
            if (kasky.equals("x")) {
                jatka = false;
                continue;
            }
            if (kasky.equals("1")) {
                palvelut.tulostakoneet(kentta);
            }
            if (kasky.equals("2")) {
                palvelut.tulostalennot(kentta);
            }
            if (kasky.equals("3")) {
                palvelut.tulostatiedot();
            }
        }
    }
}
