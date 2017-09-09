import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku: ");
        int luku = 1;
        int asti = Integer.parseInt(lukija.nextLine());
        int kerroin = 0;
        int tulo = 1;
        while(kerroin < asti) {
            tulo = tulo * luku;
            kerroin++;
            luku++;
        } System.out.println("Kertoma on " + tulo);
    }
}
