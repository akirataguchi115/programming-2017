
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.
        Scanner lukija = new Scanner(System.in);
        LintuOhjelma lintu = new LintuOhjelma();

        while (lintu.jatka()) {                 //jatkaa kunnes syöte lopettaa
            System.out.println("? ");
            String kasky = lukija.nextLine();

            if (kasky.equals("Lisaa")) {        //lisaa uusia lintuja lintutietokantaan
                System.out.println("Nimi: ");
                lintu.lisaaNimi(lukija.nextLine());
                System.out.println("Latinankielinen nimi: ");
                lintu.lisaaLatina(lukija.nextLine());

            } else if (kasky.equals("Havainto")) { //lisaa uuden havainnon lintutietokantaan
                System.out.println("Mikä havaittu? ");
                lintu.havainto(lukija.nextLine());
            } else if (kasky.equals("Tilasto")) { //Tulostaa kaikki linnut ja niiden määrät
                ArrayList<String> lista = lintu.tilasto();

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            } else if (kasky.equals("Nayta")) {    //Tulostaa halutun linnun ja sen määrän
                System.out.println("Mikä? ");
                System.out.println(lintu.nayta(lukija.nextLine()));
            } else if (kasky.equals("Lopeta")) {    //lopettaa ohjelman
                lintu.lopeta();
            }
        }

    }

}
