
import java.util.ArrayList;
import java.util.Scanner;

public class ListallaOlevienArvojenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            int koko = lista.size();
            lista.add(luettu);
        } System.out.println("Yhteensä: " + lista.size());

    }
}
