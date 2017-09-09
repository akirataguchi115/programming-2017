package kolmeyleisinta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KuinkaYleiset {

    public KuinkaYleiset() {

    }

    public Map<String, Integer> getMappi(List<String> sanat) {
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
        return mappi;
    }
}
