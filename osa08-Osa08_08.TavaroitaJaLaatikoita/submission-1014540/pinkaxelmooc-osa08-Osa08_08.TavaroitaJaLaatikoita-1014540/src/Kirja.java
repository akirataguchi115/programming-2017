
public class Kirja implements Talletettava {

    private String kirjailija;
    private String nimi;
    private double paino;

    public Kirja(String kirjoittaja, String nimi, double paino) {
        this.kirjailija = kirjoittaja;
        this.nimi = nimi;
        this.paino = paino;
    }

    @Override
    public double paino() {
        return paino;
    }

    @Override
    public String toString() {
        return kirjailija + ": " + nimi;
    }
}
