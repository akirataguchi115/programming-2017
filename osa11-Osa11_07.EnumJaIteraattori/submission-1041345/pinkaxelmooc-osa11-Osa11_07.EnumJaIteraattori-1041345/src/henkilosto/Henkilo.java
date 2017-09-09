package henkilosto;

public class Henkilo {

    private Koulutus koulutus;
    private String nimi;

    public Henkilo(String nimi, Koulutus koulutus) {
        this.nimi = nimi;
        this.koulutus = koulutus;
    }

    public Koulutus getKoulutus() {
        return koulutus;
    }

    @Override
    public String toString() {
        return nimi + ", " + koulutus;
    }
}
