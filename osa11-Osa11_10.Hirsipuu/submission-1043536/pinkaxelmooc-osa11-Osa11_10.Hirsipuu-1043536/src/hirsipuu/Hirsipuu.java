package hirsipuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hirsipuu {

    private Sanalista sanalista;
    private int arvauksiaJaljella;
    private String arvattava;
    private List<Character> arvaukset;

    public Hirsipuu(Sanalista sanalista, int arvauksiaAlussa) {
        this.sanalista = sanalista;
        this.arvauksiaJaljella = arvauksiaAlussa;
        this.arvaukset = new ArrayList<>();
        Collections.shuffle(this.sanalista.sanat());
        this.arvattava = this.sanalista.sanat().get(0);
    }

    public List<Character> arvaukset() {
        return arvaukset;
    }

    public int arvauksiaJaljella() {
        return arvauksiaJaljella;
    }

    public boolean arvaa(Character kirjain) {
        //tietokone vaihtaa nyt arvattavaa sanaa sen perusteella
        //mitkä sanat sopivat vielä pelaajan tekemiin arvauksiin
        //kone kuitenkin antaa periksi jos kyseisiin arvauksiin sopivia
        //sanoja ei enää löydy
        boolean oikein = true;
        if (!arvaukset.contains(kirjain)) {
            arvaukset.add(kirjain);
        }
        for (int i = 1; i < sanalista.koko(); i++) {
            if (arvattava.indexOf(kirjain) < 0) {
                arvauksiaJaljella--;
                return false;
            } else if (arvattava.indexOf(kirjain) >= 0) {
                arvattava = sanalista.sanat().get(i);
            }
        }
        if (arvattava.indexOf(kirjain) < 0) {
            return false;
        }
        return oikein;
    }

    public String sana() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arvattava.length(); i++) {
            sb.append('-');
        }
        for (int u = 0; u < arvattava.length(); u++) {
            for (int y = 0; y < arvaukset.size(); y++) {
                if (arvattava.charAt(u) == arvaukset.get(y)) {
                    sb.setCharAt(u, arvaukset.get(y));
                }
            }
        }
        return sb.toString();
    }

    public String oikeaSana() {
        return arvattava;
    }

    public boolean onLoppu() {
        if (arvaukset.isEmpty()) {
            return false;
        } else if (sana().indexOf('-') < 0) {
            return true;
        }
        return false;
    }

}
