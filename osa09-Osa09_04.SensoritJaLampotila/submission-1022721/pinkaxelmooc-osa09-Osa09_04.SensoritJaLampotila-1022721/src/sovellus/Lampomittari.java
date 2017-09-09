package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {

    private boolean paalla;

    public Lampomittari() {
        this.paalla = false;
    }

    @Override
    public boolean onPaalla() {
        return paalla;
    }

    @Override
    public void poisPaalta() {
        paalla = false;
    }

    @Override
    public int mittaa() {
        if (onPaalla() == false) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }

    @Override
    public void paalle() {
        paalla = true;
    }
}
