
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku < 0) {
                break;
            } else {
                lista.add(luku);
            }
        }
        lista.stream().filter(luku -> {
            if (luku >= 1 && luku <= 5) {
                return true;
            } else {
                return false;
            }
        }).forEach(arvo -> {
            System.out.println(arvo);
        });
    }
}
