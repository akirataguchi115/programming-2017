
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //luodaan muuttujat
        int lahto = 0;
        int pienin = 0;
        int maara = 0;
        int koko = 0;
        ArrayList<Integer> lista = new ArrayList();

        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == 9999) {
                break;
            } else {
                lista.add(luku);
            }
        } pienin = lista.get(lahto);
        while (maara != lista.size()) {
            if (pienin > lista.get(lahto)) {
                pienin = lista.get(lahto);
                maara++;
                lahto++;
            } else {
                maara++;
                lahto++;
            }
        }
        maara = 0;
        lahto = 0;
        System.out.println("Pienin luku on " + pienin);
        while (maara != lista.size()) {
            if (lista.get(lahto) == pienin) {
                System.out.println("Pienin luku löytyy indeksistä " + lahto);
                maara++;
                lahto++;
                
            } else {
                maara++;
                lahto++;
            }
        }
    }
}
