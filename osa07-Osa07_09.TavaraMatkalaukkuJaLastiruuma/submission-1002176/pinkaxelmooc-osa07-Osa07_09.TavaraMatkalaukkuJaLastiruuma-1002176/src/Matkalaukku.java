
import java.util.ArrayList;

public class Matkalaukku {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    public void lisaaTavara(Tavara tavara) {
        int kokpaino = kokoPaino();
        kokpaino += tavara.getPaino();
        if (kokpaino <= maksimipaino) {
            tavarat.add(tavara);
        }
    }

    public int kokoPaino() {
        int kokpaino = 0;
        for (int i = 0; i < tavarat.size(); i++) {
            kokpaino += tavarat.get(i).getPaino();
        }
        return kokpaino;
    }

    @Override
    public String toString() {
        if (tavarat.isEmpty()) {
            return "ei tavaroita (" + kokoPaino() + " kg)";
        } else if (tavarat.size() == 1) {
            return "" + tavarat.size() + " tavara (" + kokoPaino() + " kg)";
        } else {
            return "" + tavarat.size() + " tavaraa (" + kokoPaino() + " kg)";
        }
    }

    public void tulostaTavarat() {
        for (int i = 0; i < tavarat.size(); i++) {
            System.out.println(tavarat.get(i).getNimi() + " (" + tavarat.get(i).getPaino() + " kg)");

        }
    }

    public int yhteispaino() {
        return kokoPaino();
    }

    public Tavara raskainTavara() {
        if (tavarat.isEmpty()) {
            return null;
        }
        Tavara eka = tavarat.get(0);
        for (int i = 0; i < tavarat.size(); i++) {
            if (tavarat.get(i).getPaino() > eka.getPaino()) {
                eka = tavarat.get(i);
            }
        }
        return eka;
    }
}
