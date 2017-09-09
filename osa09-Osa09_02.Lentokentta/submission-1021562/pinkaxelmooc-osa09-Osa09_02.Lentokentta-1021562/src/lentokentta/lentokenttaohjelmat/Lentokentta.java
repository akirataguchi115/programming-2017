package lentokentta.lentokenttaohjelmat;

import java.util.HashMap;
import java.util.Map;

public class Lentokentta {

    private Map<String, Integer> koneet;
    private Map<String, String> lennot;

    public Lentokentta() {
        this.koneet = new HashMap<>();
        this.lennot = new HashMap<>();
    }

    public void lisaakone(String tunnus, int kapasiteetti) {
        koneet.put(tunnus, kapasiteetti);
    }

    public void lisaalento(String tunnus, String matka) {
        lennot.put(tunnus, matka);
    }

    public Map<String, Integer> getKoneet() {
        return koneet;
    }

}
