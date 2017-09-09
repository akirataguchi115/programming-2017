package mittaustentasoitus;

import java.util.ArrayList;
import java.util.List;

public class MittaustenTasoittaja2 implements Tasoittava {

    MittaustenTasoittaja2() {
    }

    @Override
    public List<Double> tasoita(List<Henkilo> henkilotiedot) {
        List<Double> lista = new ArrayList<>();
        boolean jatka = true;
        int i = 1;
        lista.add(((double) henkilotiedot.get(0).getSyke()));
        while (i < henkilotiedot.size() - 1) {
            lista.add(((double) henkilotiedot.get(i - 1).getSyke() + (double) henkilotiedot.get(i).getSyke() + (double) henkilotiedot.get(i + 1).getSyke()) / (double) 3);
            i++;
        }
        lista.add((double) henkilotiedot.get(henkilotiedot.size() - 1).getSyke());
        return lista;
    }

}
