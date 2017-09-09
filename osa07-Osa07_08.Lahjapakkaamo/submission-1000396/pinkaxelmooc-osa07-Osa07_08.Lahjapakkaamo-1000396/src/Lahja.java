
public class Lahja {

    private String nimi;
    private int paino;

    public Lahja(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    public String toString() {
        return "" + getNimi() + " (" + getPaino() + " kg)";
    }
}
