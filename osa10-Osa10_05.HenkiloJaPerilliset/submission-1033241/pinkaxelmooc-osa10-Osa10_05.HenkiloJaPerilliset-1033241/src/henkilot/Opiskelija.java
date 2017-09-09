package henkilot;

public class Opiskelija extends Henkilo {

    private int pisteet;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.pisteet = 0;
    }

    public int opintopisteita() {
        return pisteet;
    }

    public void opiskele() {
        pisteet++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + pisteet;
    }

}
