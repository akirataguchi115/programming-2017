package muuttaminen.logiikka;

import java.util.ArrayList;
import java.util.List;
import muuttaminen.Muuttolaatikko;
import muuttaminen.Tavara;

public class Pakkaaja implements Tavara {

    private int laatikoidenTilavuus;
    private List<Muuttolaatikko> pakkaukset;

    public Pakkaaja(int laatikoidenTilavuus) {
        this.laatikoidenTilavuus = laatikoidenTilavuus;
        this.pakkaukset = new ArrayList<>();
    }

    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat) {
        for (int i = 0; i < tavarat.size(); i++) {

            pakkaukset.add(new Muuttolaatikko(laatikoidenTilavuus).lisaaTavara(tavarat.get(i)));
        }
        return pakkaukset;
    }

    @Override
    public int getTilavuus() {
        
    }

}
