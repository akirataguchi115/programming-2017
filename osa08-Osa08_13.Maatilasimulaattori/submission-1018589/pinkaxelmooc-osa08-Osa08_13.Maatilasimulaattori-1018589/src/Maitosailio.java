public class Maitosailio {

    private double tilavuus;
    private double saldo;

    public Maitosailio(double tilavuus) {
        this.tilavuus = tilavuus;
        this.saldo = 0;
    }

    public Maitosailio() {
        tilavuus = 2000.0;
        this.saldo = 0;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return tilavuus - saldo;
    }

    public void lisaaSailioon(double maara) {
        if (maara < tilavuus) {
            saldo += maara;
        }
        if (maara >= tilavuus) {
            saldo = tilavuus;
        }
    }

    public double otaSailiosta(double maara) {
        if (saldo <= maara) {
            saldo = 0;
            return 0;
        } else {
            saldo -= maara;
        }
        return 0;
    }

    @Override
    public String toString() {
        return Math.ceil(saldo) + "/" + tilavuus;
    }
}
