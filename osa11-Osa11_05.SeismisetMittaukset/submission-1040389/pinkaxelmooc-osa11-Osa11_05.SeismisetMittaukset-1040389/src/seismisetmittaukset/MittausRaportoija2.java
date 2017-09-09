package seismisetmittaukset;

import java.util.List;

public class MittausRaportoija2 implements SeismisenToiminnanMittaaja {

    MittausRaportoija2() {
    }

    @Override
    public List<SuurinTaajuusRaportti> paivittaisetMaksimit(List<Double> mittausData,
            int kuukausi) {
        return null;
    }
}
