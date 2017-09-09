package lentokentta.lentokenttaohjelmat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lentokentta {

    private Map<Lentokone, String> lennot;
    private List<Lentokone> koneetList;

    public Lentokentta() {
        this.lennot = new HashMap<>();
        this.koneetList = new ArrayList<>();
    }

    public void lisaakone(String tunnus, int kapasiteetti) {
        koneetList.add(new Lentokone(tunnus, kapasiteetti));
    }

    public void lisaalento(String tunnus, String matka) {
        for (int i = 0; i < koneetList.size(); i++) {
            if (koneetList.get(i).getTunnus().equals(tunnus)) {
                lennot.put(koneetList.get(i), matka);
                i = koneetList.size();
            }
        }
    }

    public List getKoneet() {
        return koneetList;
    } 
}
