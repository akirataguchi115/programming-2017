
import java.util.ArrayList;
import java.util.Scanner;

public class KolmanneksiViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        int koko = lista.size();
        int kvika = koko-3;
        System.out.println(lista.get(kvika));

    }
}
