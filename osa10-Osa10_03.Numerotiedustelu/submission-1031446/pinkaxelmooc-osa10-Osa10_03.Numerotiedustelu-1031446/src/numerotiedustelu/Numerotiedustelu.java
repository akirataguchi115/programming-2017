package numerotiedustelu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numerotiedustelu {

    private Map<String, Henkilo> henkilot;
    private Map<String, Henkilo> henkilotNumeroidenPerusteella;

    public Numerotiedustelu() {
        this.henkilot = new HashMap<>();
        this.henkilotNumeroidenPerusteella = new HashMap<>();
    }

    public void kaynnista(Scanner lukija) {
        System.out.println("numerotiedustelu\n"
                + "käytettävissä olevat komennot:\n"
                + "1 lisää numero\n"
                + "2 hae numerot\n"
                + "3 hae puhelinnumeroa vastaava henkilö\n"
                + "4 lisää osoite\n"
                + "5 hae henkilön tiedot\n"
                + "6 poista henkilön tiedot\n"
                + "7 filtteröity listaus\n"
                + "x lopeta");
        boolean jatka = true;
        while (jatka) {
            System.out.print("\nkomento: ");
            String komento = lukija.nextLine();

            if (komento.equals("1")) {
                System.out.print("kenelle: ");
                String nimi = lukija.nextLine();
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                henkilot.putIfAbsent(nimi, new Henkilo());
                henkilot.get(nimi).lisaaNimi(nimi);
                henkilot.get(nimi).lisaaNumero(numero);

                henkilotNumeroidenPerusteella.putIfAbsent(numero, new Henkilo());
                henkilotNumeroidenPerusteella.get(numero).lisaaNimi(nimi);
                henkilotNumeroidenPerusteella.get(numero).lisaaNumero(numero);

                //suorita 1
            }
            if (komento.equals("2")) {
                System.out.print("kenen: ");
                String nimi = lukija.nextLine();
                if (!henkilot.containsKey(nimi)) {
                    System.out.println("  ei löytynyt");
                } else {
                    henkilot.get(nimi).getNumerot().stream()
                            .forEach(p -> {
                                System.out.println("  " + p);
                            });
                }
                //suorita 2 
            }

            if (komento.equals("3")) {
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                if (!henkilotNumeroidenPerusteella.containsKey(numero)) {
                    System.out.println("  ei löytynyt");
                } else {
                    System.out.println("  " + henkilotNumeroidenPerusteella.get(numero).getNimi());
                }
            }
            //suorita 3
            if (komento.equals("4")) {
                System.out.print("kenelle: ");
                String nimi = lukija.nextLine();
                System.out.print("katu: ");
                String katu = lukija.nextLine();
                System.out.print("kaupunki: ");
                String kaupunki = lukija.nextLine();
                String osoite = katu + " " + kaupunki;
                henkilot.putIfAbsent(nimi, new Henkilo());
                henkilot.get(nimi).lisaaOsoite(osoite);
                henkilot.get(nimi).lisaaNimi(nimi);

                //suorita 4
            }

            if (komento.equals("5")) {
                System.out.print("kenen: ");
                String nimi = lukija.nextLine();
                if (henkilot.get(nimi).getOsoite().isEmpty()) { //tulostetan osoite
                    System.out.println("  osoite ei tiedossa");
                } else {
                    System.out.println("  osoite: " + henkilot.get(nimi).getOsoite());
                }

                if (henkilot.get(nimi).getNumerot().isEmpty()) { //tulostetan puhelin
                    System.out.println("  ei puhelinta");
                } else {
                    System.out.println("  puhelinnumerot: ");
                    henkilot.get(nimi).getNumerot().stream()
                            .forEach(p -> {
                                System.out.println("    " + p);
                            });
                }
                //suorita 5
            }

            if (komento.equals("6")) {
                System.out.print("kenet: ");
                String nimi = lukija.nextLine();
                henkilot.get(nimi).getNumerot().stream()
                        .forEach(p -> {
                            henkilotNumeroidenPerusteella.remove(p);
                        });
                henkilot.remove(nimi);
                //suorita 6
            }

            if (komento.equals("7")) {
                System.out.print("hakusana (jos tyhjä, listataan kaikkia): ");
                String haku = lukija.nextLine();
                boolean loytyi = false;
                henkilot.values().stream()
                        .forEach(p -> {
                            if (p.getNimi().contains(haku)) {
                                loytyi = true;
                            }
                        });
                if (loytyi) {
                    //suoritetaan filtteröity tulostus
                }
                //suorita 7
            }

            if (komento.equals("x")) {
                jatka = false;
            }
        }
    }
}
