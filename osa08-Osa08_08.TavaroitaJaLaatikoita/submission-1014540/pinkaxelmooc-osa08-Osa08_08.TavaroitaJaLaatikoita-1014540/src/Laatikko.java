
import java.util.ArrayList;

public class Laatikko implements Talletettava {

    private ArrayList<Talletettava> lasti;
    private double maksimipaino;

    public Laatikko(double maksimiPaino) {
        this.maksimipaino = maksimiPaino;
        this.lasti = new ArrayList<>();
    }

    public void lisaa(Talletettava talletettava) {
        lasti.add(talletettava);
        if (paino() > maksimipaino) {
            lasti.remove(talletettava);
        }
    }

    @Override
    public String toString() {
        return "Laatikko: " + lasti.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }

    @Override
    public double paino() {
        double paino;
        paino
                = lasti.stream().mapToDouble(p -> p.paino()).sum();
        return paino;
    }

}
