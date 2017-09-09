
public class Velka {

    private double saldo;
    private double kerroin;

    public Velka(double saldoAlussa, double korkokerroinAlussa) {
        this.saldo = saldoAlussa;
        this.kerroin = korkokerroinAlussa;
    }

    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }

    public void odotaVuosi() {
        this.saldo = this.saldo * this.kerroin;
    }

}
