
import java.util.ArrayList;

public class Pakkaus {

    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }

    public void lisaaLahja(Lahja lahja) {
        lahjat.add(lahja);
    }

    public int getPaino() {
        int summa = 0;
        for (int i = 0; i < lahjat.size(); i++) {
            summa += lahjat.get(i).getPaino();
        }
        return summa;
    }
}
