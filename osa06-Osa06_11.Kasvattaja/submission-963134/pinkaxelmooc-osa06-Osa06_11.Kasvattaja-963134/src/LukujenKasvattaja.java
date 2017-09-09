
public class LukujenKasvattaja {

    public void kasvata(int[] taulukko, int paljonko) {
        int indeksi = 0;

        while (indeksi < taulukko.length) {
            taulukko[indeksi] += paljonko;
            indeksi++;
        }
        // Kirjoita koodia tänne
    }
}
