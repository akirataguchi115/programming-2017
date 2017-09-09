
import java.util.ArrayList;

// luo tänne luokkaan oma tekoälysi Uno-peliä varten
public class Tekoalypelaaja implements Pelaaja {

    // Saat luoda tarvittaessa oliomuuttujia. Jos luot konstruktorin, varmista
    // että tekoäly toimii myös parametrittomalla konstruktorilla, eli kutsulla
    // Tekoalypelaaja pelaaja = new Tekoalypelaaja();
    @Override
    public int pelaa(ArrayList<Kortti> omatKortit, Kortti paallimmaisin, String vari, Pelitilanne tilanne) {
        for (int i = 0; i < omatKortit.size(); i++) {
            if (omatKortit.get(i).getNumero() == paallimmaisin.getNumero()) {
                return i; //palauttaa kortin indeksin, jolla on sama numero
            }
            if (omatKortit.get(i).getVari().equals(paallimmaisin.getVari())) {
                return i; //palauttaa kortin indeksin, jolla on sama väri
            }
            if (omatKortit.get(i).getVari().equals(vari)) {
                return i; //palauttaa kortin numeron, jos sama väri kuin vaihdetulla värillä
            }
            if (omatKortit.get(i).onVillikortti()) {
                return i; //if all else fails, käytä villikortti
            }
        }
        return -1; //muuten nosta korttia
    }

    @Override
    public String valitseVari(ArrayList<Kortti> omatKortit) {
        String[] okVarit = {"Punainen", "Vihreä", "Sininen", "Keltainen"};
        return okVarit[2];
    }

    @Override
    public String nimi() {
        return "ns.kiltti";
        // kirjoita tänne nimimerkkisi, jonka haluat mahdollisesti näkyvän 
        // myös muualla

    }

}
