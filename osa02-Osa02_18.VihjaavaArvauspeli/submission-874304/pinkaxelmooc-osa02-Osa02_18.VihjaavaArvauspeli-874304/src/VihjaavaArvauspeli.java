
import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kun olet palauttanut tehtävän ja saanut siitä pisteet,
        // kokeile myös seuraavaa: 
        // int arvattava = (int) (1 + Math.random() * 100);

        int arvattava = 42;
        int kerroin = 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");

        while (true) {
            System.out.println("Arvaa luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku < 1 || luku > 100) {
                System.out.println("Epäkelpo luku!");
                continue;
            } else if (luku > arvattava) {
                System.out.println("Lukuni on pienempi!");
                kerroin++;
                continue;
            } else if (luku < arvattava) {
                System.out.println("Lukuni on isompi!");
                kerroin++;
                continue;
            } else if (luku == 42) {
                kerroin++;
                break;
            }
        }
        System.out.println("Oikein! Arvauksia yhteensä: " + kerroin);
    }
}
/* rivin 23 'else if'  ensin, koska arvattava on 42, on todennäköisempää että 
            'pelaaja' arvaa luvun, joka on suurempi kuin 42. Tämä järjestys johtaa 
            vähän nopeampaan ohjelman suoritukseen. */
