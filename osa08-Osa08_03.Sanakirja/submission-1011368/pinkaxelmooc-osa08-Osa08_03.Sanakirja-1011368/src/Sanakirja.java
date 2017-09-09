
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Sanakirja {

    private HashMap<String, String> kirja;

    public Sanakirja() {
        this.kirja = new HashMap<>();
    }

    public String kaanna(String sana) {
        if (kirja.containsKey(sana)) {
            return kirja.get(sana);
        } else {
            return null;
        }
    }

    public void lisaa(String sana, String kaannos) {
        kirja.put(sana, kaannos);
    }

    public int sanojenLukumaara() {
        return kirja.size();
    }

    public ArrayList<String> kaannoksetListana() {
        return kirja.entrySet().stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
