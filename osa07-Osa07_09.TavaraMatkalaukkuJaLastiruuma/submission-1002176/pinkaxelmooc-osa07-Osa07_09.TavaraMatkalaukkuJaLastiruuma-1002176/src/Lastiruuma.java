
import java.util.ArrayList;

public class Lastiruuma {

    private int maksimipaino;
    private ArrayList<Matkalaukku> ruuma;
    private int paino;

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.ruuma = new ArrayList<>();
        this.paino = 0;
    }

    public void lisaaMatkalaukku(Matkalaukku laukku) {
        int maks = 0;
        for (int i = 0; i < ruuma.size(); i++) {
            maks += ruuma.get(i).yhteispaino();
        }
        maks += laukku.yhteispaino();
        if (maks <= maksimipaino) {
            ruuma.add(laukku);
        }
    }

    @Override
    public String toString() {
        paino = 0;
        for (Matkalaukku ruuma1 : ruuma) {
            paino += ruuma1.yhteispaino();
        }
        return "" + ruuma.size() + " matkalaukkua (" + paino + " kg)";
    }

    public void tulostaTavarat() {
        for (int u = 0; u < ruuma.size(); u++) {
            ruuma.get(u).tulostaTavarat();
        }
    }
}
