
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    public void lisaaAteria(String ateria) {
        int indeksi = 0;
        this.ateriat.add(ateria);
        while (indeksi < this.ateriat.size()) {
            if (this.ateriat.get(indeksi + 1).equals(ateria)) {
                this.ateriat.remove(ateria);
                break;

            }
            indeksi++;
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
    // toteuta tänne tarvittavat metodit

}
