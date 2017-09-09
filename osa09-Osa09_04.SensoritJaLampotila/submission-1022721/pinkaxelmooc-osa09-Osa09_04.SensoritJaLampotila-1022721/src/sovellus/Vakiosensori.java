package sovellus;

public class Vakiosensori implements Sensori {

    private int luku;

    public Vakiosensori(int luku) {
        this.luku = luku;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void poisPaalta() {

    }

    @Override
    public int mittaa() {
        return luku;
    }

    @Override
    public void paalle() {

    }
}
