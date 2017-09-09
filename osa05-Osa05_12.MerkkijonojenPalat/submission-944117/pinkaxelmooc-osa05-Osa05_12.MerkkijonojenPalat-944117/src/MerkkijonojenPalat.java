
import java.util.Scanner;

public class MerkkijonojenPalat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String pilkottava = lukija.nextLine();
        String[] palat = pilkottava.split(" ");

        int indeksi = 0;
        while (indeksi < palat.length) {
            String pala = palat[indeksi];
            System.out.println(pala);
            indeksi++;
        }
    }
}
