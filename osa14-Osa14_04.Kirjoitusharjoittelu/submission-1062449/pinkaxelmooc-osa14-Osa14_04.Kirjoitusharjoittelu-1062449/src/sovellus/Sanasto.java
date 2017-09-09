package sovellus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sanasto {

    private List<String> sanat;
    private int viimeksiAnnetunSananIndeksi;

    public Sanasto() {
        this.sanat = new ArrayList<>();
        this.sanat.add("never");
        this.sanat.add("gonna");
        this.sanat.add("give");
        this.sanat.add("you");
        this.sanat.add("up");
        viimeksiAnnetunSananIndeksi = -1;
    }

    public String annaSana() {
        Random rnd = new Random();
        int annettavanSananIndeksi = rnd.nextInt(sanat.size());
        while (annettavanSananIndeksi == viimeksiAnnetunSananIndeksi) {
            annettavanSananIndeksi = rnd.nextInt(sanat.size());
        }

        this.viimeksiAnnetunSananIndeksi = annettavanSananIndeksi;
        return this.sanat.get(annettavanSananIndeksi);
    }

}
