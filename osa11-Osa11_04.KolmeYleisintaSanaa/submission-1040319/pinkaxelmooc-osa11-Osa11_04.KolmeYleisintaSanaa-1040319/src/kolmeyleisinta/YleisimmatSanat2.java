package kolmeyleisinta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class YleisimmatSanat2 implements ToistonTunnistin {

    private KuinkaYleiset yleiset;

    YleisimmatSanat2() {
        this.yleiset = new KuinkaYleiset();
    }

    @Override
    public List<String> yleisetSanat(List<String> sanat) {
        Map<String, Integer> mappi = yleiset.getMappi(sanat);
        List<String> nimet
                = mappi.keySet().stream()
                        .collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(nimet);
        nimet.subList(0, 2);
        return nimet;

    }
}
