
import java.util.ArrayList;

public class Puhelinmuistio {

    private ArrayList<Henkilo> henkilot;

    public Puhelinmuistio() {
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

    public String haeNumero(String numero) {
        int indeksi = 0;
        while (indeksi < henkilot.size()) {
            if (henkilot.get(indeksi).haeNimi().equals(numero)) {
                return henkilot.get(indeksi).haeNumero();

            }
            indeksi++;
        }
        return "numero ei tiedossa";
    }
}
