package lentokentta.lentokenttaohjelmat;

import java.util.ArrayList;
import java.util.List;

public class Lentokentta {

    private List<Lentokone> koneetList;
    private List<String> lennotList;

    public Lentokentta() {

        this.koneetList = new ArrayList<>();
        this.lennotList = new ArrayList<>();
    }

    public void lisaakone(String tunnus, int kapasiteetti) {
        koneetList.add(new Lentokone(tunnus, kapasiteetti));
    }

    public void lisaalento(String tunnus, String matka) {
        for (int i = 0; i < koneetList.size(); i++) {
            if (koneetList.get(i).getTunnus().equals(tunnus)) {
                lennotList.add(koneetList.get(i).getKokNimi() + " (" + matka + ")");
            }
        }
    }

    public List<Lentokone> getKoneet() {
        return koneetList;
    }

    public List<String> getLennot() {
        return lennotList;
    }
}
