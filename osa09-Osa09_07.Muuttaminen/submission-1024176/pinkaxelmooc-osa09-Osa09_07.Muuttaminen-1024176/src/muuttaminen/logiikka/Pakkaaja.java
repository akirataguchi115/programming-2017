package muuttaminen.logiikka;

import java.util.ArrayList;
import java.util.List;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;

public class Pakkaaja implements Tavara {

    private int laatikoidenTilavuus;
    private List<Muuttolaatikko> pakkaukset;

    public Pakkaaja(int laatikoidenTilavuus) {
        this.laatikoidenTilavuus = laatikoidenTilavuus;
        this.pakkaukset = new ArrayList<>();
    }

    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
        for (int i = 0; i < tavarat.size(); i++) {
            Muuttolaatikko boksi = new Muuttolaatikko(laatikoidenTilavuus);
            boksi.lisaaTavara(tavarat.get(i));
            pakkaukset.add(boksi);
        }
        return pakkaukset;
    }

    @Override
    public int getTilavuus() {
        return 1; //jotain vain, koska tämän olion ei kuulu kutsua getTilavuus().
    }

}
