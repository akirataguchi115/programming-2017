package muuttaminen.domain;

import muuttaminen.domain.Tavara;

public class Esine implements Tavara, Comparable<Esine> {

    private String nimi;
    private int tilavuus;

    public Esine(String nimi, int tilavuus) {
        this.nimi = nimi;
        this.tilavuus = tilavuus;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi + " (" + tilavuus + " dm^3)";
    }

    @Override
    public int getTilavuus() {
        return tilavuus;
    }

    @Override
    public int compareTo(Esine verrattava) {
        return tilavuus - verrattava.getTilavuus();
    }

}
