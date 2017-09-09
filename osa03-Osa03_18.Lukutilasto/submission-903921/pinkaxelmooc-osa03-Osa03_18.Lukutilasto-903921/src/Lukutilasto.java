
public class Lukutilasto {

    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;// alusta tässä muuttujat maara ja summa
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara++;
        this.summa = this.summa + luku;

        // kirjoita koodia tähän
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
        // kirjoita koodia tähän
    }

    public int summa() {
        return this.summa;
        // kirjoita koodia tähän
    }

    public double keskiarvo() {
        if (this.summa == 0 || this.lukujenMaara == 0) {
            return 0;
        } else {
            return ((double) this.summa / (double) this.lukujenMaara);
            // kirjoita koodia tähän
        }
    }
}
