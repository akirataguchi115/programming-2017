
public class Ostos {

    private String tuote;
    private int kpl;
    private int yksikkohinta;

    public Ostos(String tuote, int kpl, int yksikkohinta) {

        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }

    public int hinta() {
        return kpl * yksikkohinta;
    }

    public void kasvataMaaraa() {
        kpl++;
    }

    @Override
    public String toString() {
        return tuote + ": " + kpl;
    }
}
