
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa Ohjelma käyttävä ohjelmasi tänne

        ArrayList<Ohjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Pituus: ");
            int pituus = Integer.parseInt(lukija.nextLine());
            ohjelmat.add(new Ohjelma(nimi, pituus));
        }
        System.out.println("Ohjelman maksimipituus? ");
        int maxpituus = Integer.parseInt(lukija.nextLine());
        int indeksi = 0;
        while (indeksi < ohjelmat.size()) {
            Ohjelma ohjelma = ohjelmat.get(indeksi);

            if (ohjelma.getPituus() <= maxpituus) {
                System.out.println(ohjelma);
                indeksi++;
            } else {
                indeksi++;
            }
        }
    }
}
