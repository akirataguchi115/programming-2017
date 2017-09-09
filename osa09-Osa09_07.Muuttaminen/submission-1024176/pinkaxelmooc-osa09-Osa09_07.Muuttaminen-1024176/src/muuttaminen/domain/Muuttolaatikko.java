package muuttaminen.domain;

import java.util.ArrayList;
import java.util.List;
import muuttaminen.domain.Tavara;

public class Muuttolaatikko implements Tavara {

    private int maksimitilavuus;
    private List<Tavara> tila;

    public Muuttolaatikko(int maksimitilavuus) {
        this.maksimitilavuus = maksimitilavuus;
        this.tila = new ArrayList<>();
    }

    public boolean lisaaTavara(Tavara tavara) {
        if (getTilavuus() + tavara.getTilavuus() <= maksimitilavuus) {
            tila.add(tavara);
            return true;
        }
        return false;
    }

    @Override
    public int getTilavuus() {
        int tilavuus = 0;
        for (int i = 0; i < tila.size(); i++) {
            tilavuus += tila.get(i).getTilavuus();
        }
        return tilavuus;
    }
}
