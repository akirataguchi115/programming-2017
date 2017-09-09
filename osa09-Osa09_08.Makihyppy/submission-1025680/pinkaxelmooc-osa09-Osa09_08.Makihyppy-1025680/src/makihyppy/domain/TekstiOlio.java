package makihyppy.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TekstiOlio {

    private List<Hyppaaja> lista;
    private Tuomarit tuomarit;

    public TekstiOlio() {
        this.lista = new ArrayList<>();
        this.tuomarit = new Tuomarit();
    }

    public void kaynnista(Scanner lukija) {
        kaynnistaNimet(lukija);
        kaynnistaHypyt(lukija);
        kaynnistaSijat();

    }

    public void kaynnistaNimet(Scanner lukija) {
        System.out.println("Kumpulan mäkiviikot\n"
                + "\n"
                + "Syötä kilpailun osallistujat yksi kerrallaan, tyhjällä "
                + "merkkijonolla siirtyy hyppyvaiheeseen.");
        boolean jatka = true;
        while (jatka) {
            System.out.print("  Osallistujan nimi: ");
            String command = lukija.nextLine();
            if (command.isEmpty()) {
                jatka = false;
            } else {
                lista.add(new Hyppaaja(command));
            }
        }
        System.out.println("\nKilpailu alkaa!\n");
    }

    public void kaynnistaHypyt(Scanner lukija) {
        boolean jatka = true;
        int kierroslkm = 0;
        while (jatka) {
            System.out.print("Kirjoita \"hyppaa\" niin hypätään, muuten lopetetaan: ");
            String komento = lukija.nextLine();
            System.out.print("\n");
            if (!komento.equals("hyppaa")) {
                System.out.println("Kiitos!");
                jatka = false;
            } else {
                kierroslkm++;
                System.out.println(kierroslkm + ". kierros\n");
                System.out.println("Hyppyjärjestys:");
                for (int i = 0; i < lista.size(); i++) { //ota tässä huomioon se reversejuttu
                    System.out.println("  " + (i + 1) + ". " + lista.get(i).getNimi()
                            + " (" + lista.get(i).getPisteet() + " pistettä)");
                }
                System.out.print("\n");
                System.out.println("Kierroksen " + kierroslkm + " tulokset");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println("  " + lista.get(i).getNimi());
                    System.out.print("    pituus: ");
                    int hyppypisteet = lista.get(i).generateHyppy();
                    lista.get(i).lisaaPisteita(hyppypisteet);
                    System.out.println(hyppypisteet);
                    System.out.println("    tuomaripisteet: " + tuomarit.generatePoint());
                    lista.get(i).lisaaPisteita(tuomarit.valitsepisteytettävät());
                }
                for(int i = 0; i < lista.size(); i++) {
                    lista.sort();
                }
                System.out.print("\n");
            }
        }

        System.out.print("\n");

    }

    public void kaynnistaSijat() {
        System.out.println("Kilpailun lopputulokset:");

    }
}
