package seismisetmittaukset;

import java.util.ArrayList;
import java.util.List;

public class MittausRaportoija1 implements SeismisenToiminnanMittaaja {

    MittausRaportoija1() {
    }

    @Override
    public List<SuurinTaajuusRaportti> paivittaisetMaksimit(List<Double> mittausData,
            int kuukausi) {
        List<SuurinTaajuusRaportti> suurintaajuus = new ArrayList<>();
        for (int i = 0; i < mittausData.size(); i++) {
            String tupla = String.valueOf(mittausData.get(i));
            String[] palat = tupla.split(" ");
        }
        return suurintaajuus;
    }

}
