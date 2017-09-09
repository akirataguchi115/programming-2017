package sovellus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapinTekija {

    private Map<String, Map<Integer, Double>> arvot;
    private List<String> lista;

    public MapinTekija(List<String> lista) {
        this.lista = lista;
        this.arvot = new HashMap<>();
    }

    public Map<String, Map<Integer, Double>> palautaMappi() {
        String[] vuodet = lista.get(0).split("\t");
        for (int i = 1; i < lista.size(); i++) {
            String[] palat = lista.get(i).split("\t");
            for (int u = 1; u < lista.size();) {
                arvot.putIfAbsent(palat[0], new HashMap<>());
                arvot.get(palat[0]).put(Integer.parseInt(vuodet[u]), Double.parseDouble(palat[u]));
            }
        }
        return arvot;
    }

}
