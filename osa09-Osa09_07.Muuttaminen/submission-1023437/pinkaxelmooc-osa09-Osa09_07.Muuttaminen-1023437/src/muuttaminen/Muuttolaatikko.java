package muuttaminen;

import java.util.ArrayList;
import java.util.List;

public class Muuttolaatikko implements Tavara {

    private int maksimitilavuus;
    private List<Tavara> tila;
    private int tilavuus;

    public Muuttolaatikko(int maksimitilavuus) {
        this.maksimitilavuus = maksimitilavuus;
        this.tila = new ArrayList<>();
        this.tilavuus = 0;
    }

    public boolean lisaaTavara(Tavara tavara) {
        if (tilavuus + tavara.getTilavuus() <= maksimitilavuus) {
            tila.add(tavara);
            tilavuus += tavara.getTilavuus();
            return true;
        }
        return false;
    }

    @Override
    public int getTilavuus() {
        return tilavuus;
    } 
}
