package makihyppy.domain;

import java.util.Random;

public class Hyppaaja implements Comparable{

    private String nimi;
    private int pisteet;
    private Random arpoja;

    public Hyppaaja(String nimi) {
        this.nimi = nimi;
        this.pisteet = 0;
        this.arpoja = new Random();
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
        return metrit;
    }
    
    @Override
    public int compareTo(Hyppaaja hyppaaja) { /////EN YMMÄRRÄ MIKSI TÄÄ EI OVERRIDEE TÄTÄ METODIA
        return this.pisteet - hyppaaja.getPisteet();
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
