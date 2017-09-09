
public class Asevelvollinen implements Palvelusvelvollinen {

    private int paivia;

    public Asevelvollinen(int paivia) {
        this.paivia = paivia;
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
