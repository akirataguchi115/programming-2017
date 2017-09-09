package sovellus;

import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori {

    private List<Sensori> lista;
    private List<Integer> keskiarvot;

    public Keskiarvosensori() {
        this.lista = new ArrayList<>();
        this.keskiarvot = new ArrayList<>();
    }

    public void lisaaSensori(Sensori lisattava) {
        lista.add(lisattava);
    }

    @Override
    public boolean onPaalla() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).onPaalla() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void poisPaalta() {
        lista.stream().forEach(p -> p.poisPaalta());
    }

    @Override
    public int mittaa() {
        int keskiarvo = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).onPaalla() == false) {
                throw new IllegalStateException();
            }
            keskiarvo += lista.get(i).mittaa();
        }
        keskiarvo /= lista.size();
        keskiarvot.add(keskiarvo);
        return keskiarvo;
    }

    @Override
    public void paalle() {
        lista.stream().forEach(p -> p.paalle());

    }

    public List<Integer> mittaukset() {
        return keskiarvot;
    }
}
