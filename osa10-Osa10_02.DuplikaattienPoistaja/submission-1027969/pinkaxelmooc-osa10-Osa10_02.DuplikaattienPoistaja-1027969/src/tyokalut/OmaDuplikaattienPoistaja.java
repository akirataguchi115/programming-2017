package tyokalut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OmaDuplikaattienPoistaja implements DuplikaattienPoistaja {

    private Set<String> setti;
    private Integer duplikaatit;

    public OmaDuplikaattienPoistaja() {
        this.setti = new HashSet<>();
        this.duplikaatit = 0;
    }

    @Override
    public void lisaa(String merkkijono) {
        if (setti.contains(merkkijono)) {
            duplikaatit++;
        }
        setti.add(merkkijono);
    }

    @Override
    public int getHavaittujenDuplikaattienMaara() {
        return duplikaatit;
    }

    @Override
    public Set<String> getUniikitMerkkijonot() {
        return setti;
    }

    @Override
    public void tyhjenna() {
        setti.clear();
        duplikaatit = 0;
    }
}
