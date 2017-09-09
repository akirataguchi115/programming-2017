
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(skanneri.nextLine());
        if (luku > 0) {
            System.out.println("Luku on positiivinen.");
        } else {
            System.out.println("Luku ei ole positiivinen");
        }// Toteuta ohjelmasi tähän. 
    }
}
