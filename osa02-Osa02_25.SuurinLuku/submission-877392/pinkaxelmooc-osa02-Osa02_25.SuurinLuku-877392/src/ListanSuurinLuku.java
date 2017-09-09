
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int suurin = 0;
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
            if (suurin < luettu) {
                suurin = luettu;
            }
        }
        
        System.out.println("Listan suurin luku: " + suurin);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
