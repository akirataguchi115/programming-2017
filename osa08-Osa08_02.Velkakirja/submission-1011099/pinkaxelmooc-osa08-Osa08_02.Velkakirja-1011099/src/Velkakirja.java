
import java.util.HashMap;

public class Velkakirja {

    private HashMap<String, Double> kirja;

    public Velkakirja() {
        this.kirja = new HashMap<>();
    }

    public void asetaLaina(String kenelle, double maara) {
        kirja.put(kenelle, maara);
    }

    public double paljonkoVelkaa(String kuka) {
        if (kirja.containsKey(kuka)) {
            return kirja.get(kuka);
        } else {
            return 0;
        }
    }
}
