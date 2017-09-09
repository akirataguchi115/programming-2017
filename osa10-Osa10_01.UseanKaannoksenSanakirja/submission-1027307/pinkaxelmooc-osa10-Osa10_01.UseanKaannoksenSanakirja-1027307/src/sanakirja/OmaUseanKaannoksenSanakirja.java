package sanakirja;

import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

public class OmaUseanKaannoksenSanakirja implements UseanKaannoksenSanakirja {

    private Map<String, Set<String>> mappi;

    public OmaUseanKaannoksenSanakirja() {
        this.mappi = new HashMap<>();
    }

    @Override
    public void lisaa(String sana, String kaannos) {
        mappi.putIfAbsent(sana, new HashSet<>());
        mappi.get(sana).add(kaannos);
    }

    @Override
    public Set<String> kaanna(String sana) {
        if (!mappi.containsKey(sana)) {
            return new HashSet<>();
        }
        Set<String> setti = new HashSet<>();
        setti = mappi.get(sana);
        return setti;
    }

    @Override
    public void poista(String sana) {
        mappi.remove(sana);
    }

}
