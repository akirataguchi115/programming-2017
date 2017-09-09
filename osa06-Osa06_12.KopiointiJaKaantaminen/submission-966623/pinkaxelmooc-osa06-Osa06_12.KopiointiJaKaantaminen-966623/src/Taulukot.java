
public class Taulukot {

    public int[] kopioi(int[] taulukko) {

        int indeksi = 0;
        int[] kopio = new int[taulukko.length];

        while (indeksi < taulukko.length) {
            kopio[indeksi] = taulukko[indeksi];
            indeksi++;
        }
        return kopio;
    }

    public int[] kaanna(int[] taulukko) {

        int indeksi = 0;
        int andeksi = taulukko.length - 1;
        int[] kaannetty = new int[taulukko.length];

        while (indeksi < taulukko.length) {
            kaannetty[indeksi] = taulukko[andeksi];
            indeksi++;
            andeksi--;

        }
        return kaannetty;
    }
    // HUOM! Älä lisää luokalle Taulukot oliomuuttujia

}
