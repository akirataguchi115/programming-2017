
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (omistajat.get(rekkari) == null) {
            omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        if (!omistajat.containsKey(rekkari)) {
            return null;
        }
        return omistajat.get(rekkari);
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (!omistajat.containsKey(rekkari)) {
            return false;
        }

        omistajat.remove(rekkari);
        return true;
    }

    public void tulostaRekisterinumerot() {
        omistajat.keySet().stream()
                .forEach(p -> System.out.println("[" + p.toString() + "]"));
    }

    public void tulostaOmistajat() {
        omistajat.values().stream()
                .filter(i -> Collections.frequency(omistajat.values(), i) > 0)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
