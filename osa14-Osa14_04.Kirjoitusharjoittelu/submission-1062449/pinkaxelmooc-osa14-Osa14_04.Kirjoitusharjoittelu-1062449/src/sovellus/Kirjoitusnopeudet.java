package sovellus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Kirjoitusnopeudet {

    private Map<String, List<Double>> sanojenKirjoitusnopeudet;

    public Kirjoitusnopeudet() {
        this.sanojenKirjoitusnopeudet = new TreeMap<>();
    }

    public void lisaa(String sana, double aika) {
        this.sanojenKirjoitusnopeudet.putIfAbsent(sana, new ArrayList<>());
        this.sanojenKirjoitusnopeudet.get(sana).add(aika);
    }

    public Map<String, Double> keskiarvot() {
        return sanojenKirjoitusnopeudet.keySet().stream().collect(
                Collectors.toMap(
                        s -> s,
                        s -> sanojenKirjoitusnopeudet.get(s).stream().mapToDouble(d -> d).average().getAsDouble()));
    }

}
