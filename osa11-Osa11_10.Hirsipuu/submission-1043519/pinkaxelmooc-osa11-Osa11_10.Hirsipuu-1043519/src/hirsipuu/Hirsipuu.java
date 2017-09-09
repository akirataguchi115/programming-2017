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
        if (!arvaukset.contains(kirjain)) {
            arvaukset.add(kirjain);
        }
        if (arvattava.indexOf(kirjain) < 0) {
            arvauksiaJaljella--;
            return false;
        }
        return true;
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
