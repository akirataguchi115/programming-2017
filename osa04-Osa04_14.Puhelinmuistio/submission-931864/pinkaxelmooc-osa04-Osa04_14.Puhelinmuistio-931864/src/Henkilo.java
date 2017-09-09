
public class Henkilo {

    private String nimi;
    private String numero;

    public Henkilo(String nimi, String numero) {
        this.nimi = nimi;
        this.numero = numero;
    }

    public String toString() {
        return nimi + " puh: " + numero;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public String haeNumero() {
        return this.numero;
    }

    public void vaihdaNumeroa(String uusiNumero) {
        this.numero = uusiNumero;
    }
}
