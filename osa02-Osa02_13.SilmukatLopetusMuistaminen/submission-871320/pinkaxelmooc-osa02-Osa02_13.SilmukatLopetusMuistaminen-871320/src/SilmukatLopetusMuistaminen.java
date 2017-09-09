
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        //kokopaskanalku
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut:");

        //alkuarvot
        int summa = 0;
        int kerroin = 0;
        double karvo = 0;
        int parillinen = 0;
        int pariton = 0;

        //itse ohjelma
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            summa = summa + luku;
            kerroin++;
            karvo = (double) summa / (double) kerroin;
            if (luku % 2 == 0) {
                parillinen++;
            } else if (luku % 2 != 0) {
                pariton++;
            }
        }

        //publicoutput
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + kerroin);
        System.out.println("Keskiarvo: " + karvo);
        System.out.println("Parillisia: " + parillinen);
        System.out.println("Parittomia: " + pariton);
    }
}
