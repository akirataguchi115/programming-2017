
import java.time.LocalDate;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int paino = 0;
    private int pituus = 0;

    public Henkilo(String nimi, int paiva, int kuukausi, int vuosi) {
        this.nimi = nimi;
        this.syntymaPaiva = new Paivays(paiva, kuukausi, vuosi);
        this.paino = 0;
        this.pituus = 0;
    }

    // muita konstruktoreja ja metodeja
    public String getNimi() {
        return this.nimi;
    }

    public int ikaVuosina() {
        LocalDate nyt = LocalDate.now();
        int vuosiNyt = nyt.getYear();
        int kuukausiNyt = nyt.getMonthValue();
        int paivaNyt = nyt.getDayOfMonth() + (nyt.getMonthValue() * 30) + (nyt.getYear() * 360);

        // muokkaa tätä metodia sopivasti
        int ikavuosia = syntymaPaiva.getPaiva();
        int vuosia = (paivaNyt - ikavuosia) / 360;
        return vuosia;
    }

    public void setPituus(int uusiPituus) {
        this.pituus = uusiPituus;
    }

    public void setPaino(int uusiPaino) {
        this.paino = uusiPaino;
    }

    public double painoIndeksi() {
        double pituusPerSata = this.pituus / 100.0;
        return this.paino / (pituusPerSata * pituusPerSata);
    }

    @Override
    public String toString() {
        return this.nimi + ", syntynyt " + this.syntymaPaiva;
    }

}
