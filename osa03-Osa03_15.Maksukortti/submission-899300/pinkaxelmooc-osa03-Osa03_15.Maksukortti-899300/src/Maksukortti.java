
public class Maksukortti {

    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;

    }

    @Override
    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }

    public void syoEdullisesti() {
        if (this.saldo >= 2.60) {
            this.saldo = this.saldo - (double) 2.60;
        }
    }

    public void syoMaukkaasti() {
        if (this.saldo >= 4.60) {
            this.saldo = this.saldo - (double) 4.60;
        }

    }

    public void lataaRahaa(double rahaa) {
        if (rahaa > 0) {
            if (this.saldo <= 150 - this.saldo) {
                this.saldo = this.saldo + rahaa;
            } else {
                this.saldo = 150;
            }
        }
    }
}
