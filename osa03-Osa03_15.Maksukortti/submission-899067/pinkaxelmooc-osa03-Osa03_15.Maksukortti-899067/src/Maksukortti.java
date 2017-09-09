
public class Maksukortti {

    private double saldo;
    private double rahamaara;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;

    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo;
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

    public void lataaRahaa(double rahamaara) {
        this.rahamaara = rahamaara;
        if (this.rahamaara > 0) {
            if (this.saldo <= 150 - this.rahamaara) {
                this.saldo = this.saldo + this.rahamaara;
            } else {
                this.saldo = 150;
            }
        }
    }
}
