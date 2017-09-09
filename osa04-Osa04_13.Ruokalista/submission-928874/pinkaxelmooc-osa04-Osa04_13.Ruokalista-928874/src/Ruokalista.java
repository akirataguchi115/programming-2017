
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    public void lisaaAteria(String ateria) {
        if (!(this.ateriat.contains(ateria))) {
            this.ateriat.add(ateria);
        }
    }

    public void tulostaAteriat() {
        int indeksi = 0;
        while (indeksi < this.ateriat.size()) {
            String ateria = this.ateriat.get(indeksi);
            System.out.println(ateria);

            indeksi++;
        }
    }

    public void tyhjennaRuokalista() {
        ateriat.clear();
    }
}
    // toteuta tänne tarvittavat metodit
