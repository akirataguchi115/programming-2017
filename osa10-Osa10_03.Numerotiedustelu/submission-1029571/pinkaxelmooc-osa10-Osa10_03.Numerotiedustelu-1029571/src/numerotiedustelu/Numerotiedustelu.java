package numerotiedustelu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Numerotiedustelu {

    private boolean jatka;
    private Map<String, Henkilo> henkilotNimenPerusteella;
    private Map<String, String> numerotNimenPerusteella;
    private Map<String, String> nimetNumeronPerusteella;
    private List<String> nimet; //tämä, 7:aan, koska indeksillä ei voi kutsua mappeja
    private Map<String, String> kaupungit; //7:aa varten myös...

    public Numerotiedustelu() {
        this.jatka = true;
        this.henkilotNimenPerusteella = new HashMap<>();
        this.numerotNimenPerusteella = new HashMap<>();
        this.nimetNumeronPerusteella = new HashMap<>();
        this.nimet = new ArrayList<>();
        this.kaupungit = new HashMap<>();
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
        while (jatka) {
            System.out.print("\nkomento: ");
            String komento = lukija.nextLine();

            if (komento.equals("1")) {
                System.out.print("kenelle: ");
                String kenelle = lukija.nextLine();
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                henkilotNimenPerusteella.putIfAbsent(kenelle, new Henkilo(kenelle, numero));
                henkilotNimenPerusteella.computeIfPresent(kenelle, (t, v) -> {
                    v.lisaaNumero(numero);
                    return v;
                });//ongelma
                numerotNimenPerusteella.put(kenelle, numero);
                nimetNumeronPerusteella.put(numero, kenelle);
                nimet.add(kenelle);
            }

            if (komento.equals("2")) {
                System.out.print("kenen: ");
                String kenen = lukija.nextLine();
                if (!numerotNimenPerusteella.containsKey(kenen)) {
                    System.out.println("  ei löytynyt");
                } else {
                    for (int i = 0; i < numerotNimenPerusteella.size(); i++) {
                        System.out.println("  " + henkilotNimenPerusteella.get(kenen).getNumero());
                    }

                }
            }
            if (komento.equals("3")) {
                System.out.print("numero: ");
                String numero = lukija.nextLine();
                if (!nimetNumeronPerusteella.containsKey(numero)) {
                    System.out.println("  ei löytynyt");
                } else {
                    System.out.println("  " + nimetNumeronPerusteella.get(numero));
                }
            }
            if (komento.equals("4")) {
                System.out.print("kenelle: ");
                String nimi = lukija.nextLine();
                System.out.print("katu: ");
                String katu = lukija.nextLine();
                System.out.print("kaupunki: ");
                String kaupunki = lukija.nextLine();
                if (henkilotNimenPerusteella.containsKey(nimi)) {
                    henkilotNimenPerusteella.get(nimi).lisaaOsoite(katu);
                    henkilotNimenPerusteella.get(nimi).lisaaKaupunki(kaupunki);
                    kaupungit.put(nimi, kaupunki);
                } else {
                    henkilotNimenPerusteella.putIfAbsent(nimi, new Henkilo(nimi, ""));
                    henkilotNimenPerusteella.get(nimi).lisaaOsoite(katu);
                    henkilotNimenPerusteella.get(nimi).lisaaKaupunki(kaupunki);
                    kaupungit.put(nimi, kaupunki);
                    henkilotNimenPerusteella.get(nimi).getNumero().remove("");
                }
            }
            if (komento.equals("5")) {
                System.out.print("kenen: ");
                String kenen = lukija.nextLine(); //koodi toimii tällä hetkellä 
                //oletuksella että syöte on oikein muuten tulee NPE
                if (henkilotNimenPerusteella.isEmpty()) {
                    System.out.println("  osoite ei tiedossa");
                } else if (henkilotNimenPerusteella.get(kenen).getKadut().isEmpty() && henkilotNimenPerusteella.get(kenen).getKaupunki().isEmpty()) {
                    System.out.println("  osoite ei tiedossa"); //joku vikana, toteutuu aina
                } else {
                    System.out.print("  osoite: ");
                    for (int i = 0; i < henkilotNimenPerusteella.get(kenen).getKadut().size(); i++) {
                        System.out.print(henkilotNimenPerusteella.get(kenen).getKadut().get(i) + " ");
                        System.out.println(henkilotNimenPerusteella.get(kenen).getKaupunki().get(i));
                    }
                }
                if (henkilotNimenPerusteella.isEmpty()) {
                }
                if (henkilotNimenPerusteella.get(kenen).getNumero().isEmpty()) {
                    System.out.println("  ei puhelinta");
                } else {
                    for (int i = 0; i < henkilotNimenPerusteella.get(kenen).getNumero().size(); i++) {
                        System.out.println("  puhelinumerot: ");
                        for (int u = 0; u < henkilotNimenPerusteella.get(kenen).getNumero().size(); u++) {
                            System.out.println("    " + henkilotNimenPerusteella.get(kenen).getNumero().get(u));
                        }
                    }
                }
            }
            if (komento.equals("6")) { //MUISTA PÄIVITTÄÄ TÄTÄ KANS JOS MUUTAT LISTOI
                System.out.print("kenet: ");
                String kenet = lukija.nextLine();
                henkilotNimenPerusteella.remove(kenet);
                nimetNumeronPerusteella.remove(kenet);
                numerotNimenPerusteella.remove(kenet);
                for (int i = 0; i < nimet.size(); i++) {
                    if (nimet.get(i).equals(kenet)) {
                        nimet.remove(i);
                    }
                }
            }

            if (komento.equals("7")) {
                System.out.print("hakusana (jos tyhjä, listataan kaikki): ");
                String haku = lukija.nextLine();

                if (haku.isEmpty()) {
                    System.out.print("\n");
                    for (int u = 0; u < nimet.size(); u++) {
                        System.out.println("  " + nimet.get(u));
                        if (henkilotNimenPerusteella.get(nimet.get(u)).getKadut().isEmpty() && henkilotNimenPerusteella.get(nimet.get(u)).getKaupunki().isEmpty()) {
                            System.out.println("    osoite ei tiedossa"); //näissä on joku vikana korjaa ennen submit
                        } else {
                            System.out.print("    osoite: ");
                            for (int i = 0; i < henkilotNimenPerusteella.get(nimet.get(u)).getKadut().size(); i++) {
                                System.out.print(henkilotNimenPerusteella.get(nimet.get(u)).getKadut().get(i) + " ");
                                System.out.println(henkilotNimenPerusteella.get(nimet.get(u)).getKaupunki().get(i));
                            }
                        }
                        if (henkilotNimenPerusteella.get(nimet.get(u)).getNumero().isEmpty()) {
                            System.out.println("    ei puhelinta");
                        } else {
                            System.out.println("    puhelinumerot: ");
                            for (int i = 0; i < henkilotNimenPerusteella.get(nimet.get(u)).getNumero().size(); i++) {
                                System.out.println("      " + henkilotNimenPerusteella.get(nimet.get(u)).getNumero().get(i));
                            }
                        }

                    }
                } else if (!kaupungit.containsValue(haku)) {
                    System.out.println("  ei löytynyt");
                } else {
                    List<String> halututNimet = new ArrayList<>();
                    for (int e = 0; e < kaupungit.size(); e++) {
                        if (kaupungit.get(nimet.get(e)).equals(haku)) {
                            halututNimet.add(nimet.get(e));
                        }
                    }
                    System.out.print("\n");
                    for (int u = 0; u < halututNimet.size(); u++) {
                        System.out.println("  " + halututNimet.get(u));
                        if (henkilotNimenPerusteella.get(halututNimet.get(u)).getKadut().isEmpty() && henkilotNimenPerusteella.get(halututNimet.get(u)).getKaupunki().isEmpty()) {
                            System.out.println("    osoite ei tiedossa"); //näissä on joku vikana korjaa ennen submit
                        } else {
                            System.out.print("    osoite: ");
                            for (int i = 0; i < henkilotNimenPerusteella.get(halututNimet.get(u)).getKadut().size(); i++) {
                                System.out.print(henkilotNimenPerusteella.get(halututNimet.get(u)).getKadut().get(i) + " ");
                                System.out.println(henkilotNimenPerusteella.get(halututNimet.get(u)).getKaupunki().get(i));
                            }
                        }
                        if (henkilotNimenPerusteella.get(halututNimet.get(u)).getNumero().isEmpty()) {
                            System.out.println("    ei puhelinta");
                        } else {
                            System.out.println("    puhelinumerot: ");
                            for (int i = 0; i < henkilotNimenPerusteella.get(nimet.get(u)).getNumero().size(); i++) {
                                System.out.println("      " + henkilotNimenPerusteella.get(halututNimet.get(u)).getNumero().get(i));
                                System.out.print("\n");
                            }
                        }

                    }
                }
            }
            if (komento.equals("x")) {
                jatka = false;
            }
        }
    }
}
//täl 186. rivillä tulee mietittyy et millaselt tää koodi ois näyttäny lambdalla
