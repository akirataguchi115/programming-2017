package mittaustentasoitus;

import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja1 implements Tasoittava {

    MittaustenTasoittaja1() {
    }

    @Override
    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        List<Double> lista = new ArrayList<>();
        lista.add((double) henkilotiedot.get(0).getSyke());
        for (int i = 1; i < henkilotiedot.size() - 1; i++) {
            lista.add(((double) henkilotiedot.get(i - 1).getSyke() + (double) henkilotiedot.get(i).getSyke() + (double) henkilotiedot.get(i + 1).getSyke()) / (double) 3);
        }
        lista.add((double) henkilotiedot.get(henkilotiedot.size() - 1).getSyke());
        return lista;
    }
}
