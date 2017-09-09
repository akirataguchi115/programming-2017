
public class Sivari implements Palvelusvelvollinen {

    private int paivia;

    public Sivari() {
        this.paivia = 362;
    }

    public void palvele() {
        if (paivia > 0) {
            paivia -= 1;
        }
    }

    public int paiviaJaljella() {
        return paivia;
    }

}
