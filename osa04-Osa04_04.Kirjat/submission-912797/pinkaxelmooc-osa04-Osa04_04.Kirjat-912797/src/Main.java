
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();

        while (true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            } else {
                System.out.println("Sivuja: ");
                int sivuja = Integer.parseInt(lukija.nextLine());
                System.out.println("Kirjoitusvuosi: ");
                int vuosi = Integer.parseInt(lukija.nextLine());
                kirjat.add(new Kirja(nimi, sivuja, vuosi));
            }
        }
        System.out.println("Mitä tulostetaan? ");
        String mita = lukija.nextLine();
        if (mita.equals("kaikki")) {
            int indeksi = 0;
            while (indeksi < kirjat.size()) {
                Kirja kirja = kirjat.get(indeksi);
                kirja.toString();
                indeksi++;
            }
        } else if (mita.equals("nimi")) {
            int indeksi = 0;
            while (indeksi < kirjat.size()) {
                Kirja kirja = kirjat.get(indeksi);
                kirja.getNimi();
                indeksi++;
            }
        }
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä

    }
}
