
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        while (true) {
            System.out.println("Anna salasana: ");
            String luettu = lukija.nextLine();
            if (!(luettu.equals(salasana))) {
                System.out.println("Väärin!");// Toteuta ohjelmasi tähän.
            } else if (luettu.equals(salasana)) {
                System.out.println("Oikein!");
                System.out.println("");
                System.out.println("Salaisuus on: znvavbfgv grugl!");
                break;
            }
        }
    }
}
