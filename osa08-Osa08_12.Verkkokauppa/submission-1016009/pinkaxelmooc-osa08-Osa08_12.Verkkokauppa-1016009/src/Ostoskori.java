
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {

    private Map<String, Ostos> kori;

    public Ostoskori() {
        this.kori = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (kori.containsKey(tuote)) {
            kori.get(tuote).kasvataMaaraa();
        } else {
            kori.put(tuote, new Ostos(tuote, 1, hinta));
        }
    }

    public int hinta() {
        int summa;
        summa
                = kori.values().stream()
                        .mapToInt(p -> p.hinta()).sum();
        return summa;
    }

    public void tulosta() {
        kori.values().stream().forEach(p -> System.out.println(p.toString()));
    }

}
