
import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());

        int jns = (luku % 2);
        if (jns == 0) {
            System.out.println("Luku " + luku + " on parillinen.");
        } else if (jns != 0) {
            System.out.println("Luku " + luku + " on pariton.");
        }
    }
}
// Toteuta ohjelmasi tähän. 

// VIHJE:
// parillisuuden voi selvittää helposti jakojäännösoperaattorilla %
// kokeile mitä seuraavat komennot tulostavat
// System.out.println( 1%2 );
// System.out.println( 2%2 );
// System.out.println( 3%2 );
// System.out.println( 4%2 );
// System.out.println( 5%2 );
// System.out.println( 6%2 );
// System.out.println( 7%2 );
// int luku = 8
// System.out.println( luku%2 );
// eli ottamalla luvusta kahden jakojäännöksen, selviää parillisuus!

