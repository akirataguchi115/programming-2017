
import java.util.ArrayList;

public class Puhelinmuistio {

    private String nimi;
    private String numero;
    private ArrayList<Henkilo> henkilot;

    public void lisaa(String nimi, String numero) {
        this.henkilot = new ArrayList<>();
        this.nimi = nimi;
        this.numero = numero;
        Henkilo henkilo = new Henkilo(this.nimi, this.numero);
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
