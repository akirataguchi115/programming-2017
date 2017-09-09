
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]: ");
        int p = Integer.parseInt(lukija.nextLine());
        if (p > 100) {
            System.out.println("uskomatonta!");
        } else if (p >= 91) {
            System.out.println("5");
        } else if(p >= 81) {
            System.out.println("4");
        } else if (p >= 71) {
            System.out.println("3");
        } else if (p >= 61) {
            System.out.println("2");
        } else if (p >= 51) {
            System.out.println("1");
        } else if (p >= 0) {
            System.out.println("hylätty");
        } else if (p < 0) {
            System.out.println("mahdotonta!");
        }
    }
}
