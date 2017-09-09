package kolmeyleisinta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class YleisimmatSanat1 implements ToistonTunnistin {

    YleisimmatSanat1() {
    }

    @Override
    public List<String> yleisetSanat(List<String> sanat) {
        List<Integer> maarat = new ArrayList<>();
        Map<String, Integer> mappi = new HashMap<>();
        for (int i = 0; i < sanat.size(); i++) {
            int maara = 0;
            for (int u = i; u < sanat.size(); u++) {
                if (sanat.get(i).equals(sanat.get(u))) {
                    maara++;
                }
            }
            mappi.put(sanat.get(i), maara);
            //sortByValue(mappi);
        }
        List<String> nimet
                = mappi.keySet().stream()
                        .collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(nimet);
        nimet.subList(0, 2);
        return nimet;
    }

}
