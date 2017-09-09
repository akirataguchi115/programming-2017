
import java.util.ArrayList;
import java.util.Scanner;

public class TietynArvonTulostaminen {

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
        if (lista.get(2).equals("") {
            System.out.println("Liian vähän nimiä!");
        } else {
            System.out.println(lista.get(2));
        }
    }
}
