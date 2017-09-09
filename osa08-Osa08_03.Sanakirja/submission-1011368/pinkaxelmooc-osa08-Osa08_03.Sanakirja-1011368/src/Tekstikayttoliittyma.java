
import java.util.Scanner;

public class Tekstikayttoliittyma {

    private Scanner komento;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.komento = lukija;
        this.sanakirja = sanakirja;
    }

    public void kaynnista() {
        System.out.println("Komennot:\n"
                + "  lisaa - lisää sanaparin sanakirjaan\n"
                + "  kaanna - kysyy sanan ja tulostaa sen käännöksen\n"
                + "  lopeta - poistuu käyttöliittymästä");
        System.out.println("Komento: ");
        String syote = "";
        boolean jatka = true;
        while (jatka) {
            syote = komento.nextLine();
            if (syote.equals("lopeta")) {
                System.out.println("Hei hei!\n");
                jatka = false;
            } else if (syote.equals("lisaa")) {
                lisaa();
            } else if (syote.equals("kaanna")) {
                kaanna();
            } else {
                System.out.println("Tuntematon komento.\n");
            }
        }
    }

    public void lisaa() {
        System.out.println("Suomeksi: ");
        String sana = komento.nextLine();
        System.out.println("Käännös: ");
        String kaannos = komento.nextLine();
        sanakirja.lisaa(sana, kaannos);
    }

    public void kaanna() {
        System.out.println("Anna sana: ");
        String sana = komento.nextLine();
        System.out.println(sanakirja.kaanna(sana));
    }
}
