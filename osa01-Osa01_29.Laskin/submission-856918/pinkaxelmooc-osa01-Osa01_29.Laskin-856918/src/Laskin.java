
import java.util.Scanner;

public class Laskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna operaatio: ");
        String op = lukija.nextLine();
        if (op.equals("+")) {
            int vast = eka + toka;
            System.out.println(eka + " + " + toka + " = " + vast);
        } else if (op.equals("-")) {
            int vast = eka - toka;
            System.out.println(eka + " - " + toka + " = " + vast);
        } else if (op.equals("*")) {
            int vast = eka * toka;
            System.out.println(eka + " * " + toka + " = " + vast);
        } else if (op.equals("/")) {
            double vast = (double) eka / toka;
            System.out.println(eka + " / " + toka + " = " + vast);
        }
    }
}
