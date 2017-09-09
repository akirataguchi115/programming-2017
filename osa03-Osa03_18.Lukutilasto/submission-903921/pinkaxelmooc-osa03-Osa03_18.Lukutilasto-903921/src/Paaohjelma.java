
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parillisetTilasto = new Lukutilasto();
        Lukutilasto parittomatTilasto = new Lukutilasto();
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna lukuja: ");
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            } else if (luku % 2 == 0) {
                parillisetTilasto.lisaaLuku(luku);
                tilasto.lisaaLuku(luku);

            } else if (!(luku % 2 == 0)) {
                parittomatTilasto.lisaaLuku(luku);
                tilasto.lisaaLuku(luku);
            }

        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parillisetTilasto.summa());
        System.out.println("Parittomien summa: " + parittomatTilasto.summa());
    }
}

// voit tehdä testikoodia tänne
// poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi
// Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
//  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
