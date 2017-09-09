
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {

    private Map<String, Ostos> kori;

    public Ostoskori() {
        this.kori = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        kori.put(tuote, new Ostos(tuote, 1, hinta));
    }

    public int hinta() {
        int summa;
        summa
                = kori.values().stream().
                        //miten saan kutsuttua korin valuesin hinta metodin tähän
                        .mapToInt(p -> p)
                        .sum()
        return summa;
    }

}
