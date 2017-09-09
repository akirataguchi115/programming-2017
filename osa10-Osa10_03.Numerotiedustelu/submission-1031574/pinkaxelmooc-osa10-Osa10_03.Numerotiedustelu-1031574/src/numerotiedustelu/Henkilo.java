package numerotiedustelu;

import java.util.ArrayList;
import java.util.List;

public class Henkilo implements Comparable<Henkilo> {

    private String nimi;
    private List<String> numerot;
    private String osoite;

    public Henkilo() {
        this.nimi = new String();
        this.numerot = new ArrayList<>();
        this.osoite = new String();
    }

    public void lisaaNimi(String parNimi) {
        nimi = parNimi;
    }

    public void lisaaNumero(String parNumero) {
        numerot.add(parNumero);
    }

    public void lisaaOsoite(String parOsoite) {
        osoite = parOsoite;
    }

    public String getNimi() {
        return nimi;
    }

    public List<String> getNumerot() {
        return numerot;
    }

    public String getOsoite() {
        return osoite;
    }

    @Override
    public int compareTo(Henkilo henkilo) {
        return nimi.compareTo(henkilo.getNimi());
    }
}
