
public class Kasvatuslaitos {

    private int punnitukset;

    public int punnitse(Henkilo henkilo) {
        return henkilo.getPaino();

    }

    public void lisaa() {
        this.punnitukset++;
    }

    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino() + 1);
    }

    public int punnitukset() {
        return this.punnitukset;
    }
}
