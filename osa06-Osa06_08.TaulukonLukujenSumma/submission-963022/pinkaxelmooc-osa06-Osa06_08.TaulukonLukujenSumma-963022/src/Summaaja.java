
public class Summaaja {

    public int laskeTaulukonLukujenSumma(int[] taulukko) {
        int indeksi = 0;
        int summa = 0;

        while (indeksi < taulukko.length) {
            summa += taulukko[indeksi];
            indeksi++;
        }
        return summa;
    }
}
