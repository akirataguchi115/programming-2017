
import java.util.ArrayList;

public class Joukkue {

    private String nimi;
    private ArrayList<Pelaaja> joukkue;
    private int maksim;

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.joukkue = new ArrayList<>();
        this.maksim = 16;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public void lisaaPelaaja(Pelaaja peluri) {
        if (this.joukkue.size() < this.maksim) {
            this.joukkue.add(peluri);
        }
    }

    public void tulostaPelaajat() {
        for (Pelaaja peluri : this.joukkue) {
            System.out.println(peluri);
        }
    }

    public void asetaMaksimikoko(int maksimikoko) {
        this.maksim = maksimikoko;
    }

    public int koko() {
        return this.joukkue.size();
    }

    public int maalit() {
        int indeksi = 0;
        int summa = 0;
        while (indeksi < this.joukkue.size()) {
            summa = summa + this.joukkue.get(indeksi).maalit();
            indeksi++;
        }
        return summa;
    }
}
