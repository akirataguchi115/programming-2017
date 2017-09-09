
import java.util.ArrayList;
import java.util.Scanner;

public class FibonaccinLukujono {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int luku = 1;
        int maara = 2;

        lista.add(0);
        lista.add(1);
        while (maara != 41) {
            lista.add(lista.get(luku) + lista.get(luku - 1));
            luku++;
            maara++;
        }
        System.out.println("Moneso luku? ");
        int luk = Integer.parseInt(lukija.nextLine());
        System.out.println(lista.get(luk));

        // Toteuta tänne ohjelma, joka ensin laskee listalle 40 
        // ensimmäistä fibonaccin lukua. 
        // Tämän jälkeen ohjelma kysyy käyttäjältä lukuja, ja 
        // kertoo aina halutussa indeksissä olevan fibonaccin luvun.
        // Ohjelman suoritus päättyy kun käyttäjä syöttää luvun -1
    }
}
