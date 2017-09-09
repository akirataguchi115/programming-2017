
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {

    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;

    public Varasto() {
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        hinnat.put(tuote, hinta);
        saldot.put(tuote, saldo);
    }

    public int hinta(String tuote) {
        if (saldot.containsKey(tuote)) {
            if (saldot.get(tuote) > 0) {
                return hinnat.get(tuote);
            }

        }
        return -99;
    }

    public int saldo(String tuote) {
        if (saldot.containsKey(tuote)) {
            return saldot.get(tuote);
        }
        return 0;
    }

    public boolean ota(String tuote) {
        if (!saldot.containsKey(tuote)) {
            return false;
        }
        if (saldot.get(tuote) == 0) {
            return false;
        }

        saldot.replace(tuote, saldot.get(tuote) - 1);
        return true;
    }

    public Set<String> tuotteet() {
        return saldot.keySet();
    }
}
