
import java.util.Arrays;

public class Valintajarjestaminen {

    private int pienin;
    private int pindeksi;
    private int uusiindeksi;

    public int pienin(int[] taulukko) {
        pienin = taulukko[0];
        for (int i = 1; i < taulukko.length; i++) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
            }
        }
        return pienin;
    }

    public int pienimmanIndeksi(int[] taulukko) {
        pienin = taulukko[0];
        for (int i = 1; i < taulukko.length; i++) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
                pindeksi = i;

            }
        }
        return pindeksi;
    }

    public int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        pienin = taulukko[aloitusIndeksi];
        pindeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
                pindeksi = i;
            }

        }
        return pindeksi;
    }

    public void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int eka = taulukko[indeksi1];
        int toka = taulukko[indeksi2];

        taulukko[indeksi1] = toka;
        taulukko[indeksi2] = eka;
        // kirjoita koodia tähän
    }

    public void jarjesta(int[] taulukko) {
        System.out.println(Arrays.toString(taulukko));
        for (int i = 0; i < taulukko.length; i++) {
          Valintajarjestaminen.pienin(taulukko);
        }
    }
}
