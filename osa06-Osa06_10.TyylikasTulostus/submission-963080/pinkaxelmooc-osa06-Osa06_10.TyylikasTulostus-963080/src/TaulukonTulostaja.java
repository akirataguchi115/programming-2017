
public class TaulukonTulostaja {

    public void tulostaTyylikkaasti(int[] taulukko) {
        int indeksi = 0;

        while (indeksi < taulukko.length - 1) {
            System.out.print(taulukko[indeksi] + ", ");
            indeksi++;
        }
        System.out.print(taulukko[indeksi]);
        // Kirjoita koodia tänne
    }
}
