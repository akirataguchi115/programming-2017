
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        } int paikka = 0;
        int summa = 0;
        while(paikka < lista.size()) {
            summa += lista.get(paikka);
            paikka++;
        }
        
        System.out.println("Summa: " + summa);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
