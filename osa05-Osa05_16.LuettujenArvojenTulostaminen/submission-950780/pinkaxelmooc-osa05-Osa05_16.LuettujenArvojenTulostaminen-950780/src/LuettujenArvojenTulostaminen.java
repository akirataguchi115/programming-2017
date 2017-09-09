
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String sana = lukija.nextLine();
            if (sana.equals("")) {
                break;
            } else {
                lista.add(sana);
            }
        }
        lista.stream().forEach(sana -> {
            System.out.println(sana);
        });
    }
}
