package laatikot;

public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        if (paino < 0) {
            throw new IllegalArgumentException();
        }
        this.nimi = nimi;
        this.paino = paino;
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    public boolean equals(Tavara tavara) {
        return this.nimi.equals(tavara.getNimi());
    }

    @Override
    public int hashCode() {
        return this.nimi.hashCode();
    }
}
