package lukija.ehdot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class VahintaanYksi implements Predicate<String> {

    private List<Predicate> lista;

    public VahintaanYksi(Predicate<String>... saannot) {
        this.lista = new ArrayList<>();
        for (Predicate saannot1 : saannot) {
            lista.add(saannot1);
        }

    }

    @Override
    public boolean test(String t) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).test(t)) {
                return true;
            }
        }
        return false;
    }

}
