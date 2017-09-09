
import java.util.ArrayList;
import java.util.Scanner;

public class Peltipoliisit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> rekkari = new ArrayList<>();
        ArrayList<Integer> nopeus = new ArrayList<>();

        int indeksi1 = 0;
        int indeksi2 = 1;

        while (true) {
            String tieto = lukija.nextLine();
            if (tieto.equals("")) {
                break;
            } else {
                String[] palat = tieto.split(";");
                rekkari.add(palat[0]);

                String pala = palat[1];
                int speed = Integer.parseInt(pala);
                nopeus.add(speed);

                indeksi1 += 2;
                indeksi2 += 2;
            }
        }

        indeksi1 = 0;
        indeksi2 = 0;
        int nopein = 0;
        int nopindeksi = 0;
        int hitain = 0;
        int hitindeksi = 0;
        double koknopeus = 0;
        double keskiarvo = 0;

        while (indeksi1 < rekkari.size()) {
            if (nopeus.get(indeksi2) > nopein) {
                nopein = nopeus.get(indeksi2);
                nopindeksi = indeksi2;
                indeksi1++;
                indeksi2++;
            } else {
                indeksi1++;
                indeksi2++;
            }
        }

        indeksi1 = 0;
        indeksi2 = 0;
        hitain = nopeus.get(indeksi2);

        while (indeksi1 < rekkari.size()) {
            if (nopeus.get(indeksi2) < hitain) {
                hitain = nopeus.get(indeksi2);
                hitindeksi = indeksi2;
                indeksi1++;
                indeksi2++;
            } else {
                indeksi1++;
                indeksi2++;
            }
        }
        indeksi2 = 0;
        indeksi1 = 0;

        while (indeksi2 < nopeus.size()) {
            koknopeus += nopeus.get(indeksi1);
            indeksi2++;
            indeksi1++;
        }
        keskiarvo = (double) koknopeus / (double) nopeus.size();
        System.out.println("Suurin: " + rekkari.get(nopindeksi) + ", " + nopein);
        System.out.println("Pienin: " + rekkari.get(hitindeksi) + ", " + hitain);
        System.out.println("Keskiarvo: " + keskiarvo);

    }
}
