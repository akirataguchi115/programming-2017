package numerotiedustelu;

import java.util.ArrayList;
import java.util.List;

public class Henkilo {

    private String nimi;
    private List<String> osoite;
    private List<String> kaupunki;
    private List<String> numero;

    public Henkilo(String nimi, String numero) {
        this.nimi = nimi;
        this.osoite = new ArrayList<>();
        this.kaupunki = new ArrayList<>();
        this.numero = new ArrayList<>();
        this.numero.add(numero);
    }

    public void lisaaOsoite(String parOsoite) {
        osoite.add(parOsoite);
    }

    public void lisaaKaupunki(String parKaupunki) {
        kaupunki.add(parKaupunki);
    }

    public void lisaaNumero(String parNumero) {
        numero.add(parNumero);
    }

    public String getNimi() {
        return nimi;
    }

    public List<String> getNumero() {
        return numero;
    }

    public List<String> getKaupunki() {
        return kaupunki;
    }

    public List<String> getKadut() {
        return osoite;
    }
}
