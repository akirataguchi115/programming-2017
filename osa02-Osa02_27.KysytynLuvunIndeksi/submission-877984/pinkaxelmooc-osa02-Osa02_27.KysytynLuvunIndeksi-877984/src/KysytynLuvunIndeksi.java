
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int paikka = 0;
        int luku = 0;
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("Mitä etsitään? ");
        int etsi = Integer.parseInt(lukija.nextLine());
        if (lista.contains(etsi)) {
            while (true) {
                luku = lista.get(paikka);
                if (luku == etsi) {
                    break;
                }
                paikka++;
            }
            System.out.println("Luku " + etsi + " on indeksissä " + paikka);
        } else {
            System.out.println("Lukua " + etsi + " ei löydy.");
        } 

        // toteuta tänne toiminnallisuus luvun etsimiseen
    }
}
