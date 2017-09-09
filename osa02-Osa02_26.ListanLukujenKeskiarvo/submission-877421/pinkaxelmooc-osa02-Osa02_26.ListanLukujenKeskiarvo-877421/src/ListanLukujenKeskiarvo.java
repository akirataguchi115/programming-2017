
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int summa = 0;
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            list.add(luku);
            summa += luku;
        }
        double karvo = ((double) summa / (double) list.size());
        System.out.println("Keskiarvo: " + karvo);
        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville

    }
}
