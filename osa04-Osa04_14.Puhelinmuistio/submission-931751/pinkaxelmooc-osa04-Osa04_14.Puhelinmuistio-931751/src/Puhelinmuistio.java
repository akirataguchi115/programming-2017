
import java.util.ArrayList;

public class Puhelinmuistio {

    private ArrayList<Henkilo> henkilot;

    public Konstruktori() {
        this.henkilot = new ArrayList<>();
    }

    public void lisaa(String nimi, String numero) {
        Henkilo henkilo = new Henkilo(nimi, numero);
        this.henkilot.add(henkilo);
    }

    public void tulostaKaikki() {
        int indeksi = 0;
        while (indeksi < henkilot.size()) {
            System.out.println(henkilot.get(indeksi));
            indeksi++;
        }
    }
}
