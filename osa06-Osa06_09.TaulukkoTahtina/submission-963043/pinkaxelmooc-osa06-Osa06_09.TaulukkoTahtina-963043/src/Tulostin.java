
public class Tulostin {

    public void tulostaTaulukkoTahtina(int[] taulukko) {
        int indeksi = 0;

        while (indeksi < taulukko.length) {
            int pointer = 0;
            while (taulukko[indeksi] > pointer) {
                System.out.print("*");
                pointer++;
            }
            System.out.println("");
            indeksi++;
        }
        // Kirjoita tulostuskoodi tänne
    }
}
