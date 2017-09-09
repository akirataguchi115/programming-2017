package makihyppy.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hyppaaja implements Comparable<Hyppaaja> {

    private String nimi;
    private int pisteet;
    private Random arpoja;
    private List<Integer> listametreista;

    public Hyppaaja(String nimi) {
        this.nimi = nimi;
        this.pisteet = 0;
        this.arpoja = new Random();
        this.listametreista = new ArrayList<>();
    }

    public int getPisteet() {
        return pisteet;
    }

    public String getNimi() {
        return nimi;
    }

    public void lisaaPisteita(int lisaapisteita) {
        pisteet += lisaapisteita;
    }

    public int generateHyppy() {
        int metrit = arpoja.nextInt(61) + 60;
        listametreista.add(metrit);
        return metrit;
    }

    @Override
    public int compareTo(Hyppaaja hyppaaja) { /////EN YMMÄRRÄ MIKSI TÄÄ EI OVERRIDEE TÄTÄ METODIA
        return hyppaaja.getPisteet() - this.pisteet;
    }

    public List<Integer> getMetrit() {
        return listametreista;
    }
}
