
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int kerroin = 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        while (true) {
            System.out.println("Arvaa luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku < 1 || luku > 10) {
                System.out.println("Epäkelpo luku!");
                continue;
            } else if (luku != 7) {
                kerroin++;
                continue;
            } else if(luku == 7) {
                kerroin++;
                break;
            } 
        } System.out.println("Oikein! Arvauksia yhteensä: " + kerroin);
    }
}
