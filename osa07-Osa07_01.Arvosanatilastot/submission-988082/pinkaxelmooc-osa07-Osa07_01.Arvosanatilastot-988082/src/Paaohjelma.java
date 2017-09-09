
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lisaaja a = new Lisaaja();
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while (a.hyvaksytytNumerot()) {
            a.lisaa(Integer.parseInt(lukija.nextLine()));
        }
        System.out.println("Pisteiden keskiarvo (kaikki): " + a.keskiArvo());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + a.hkeskiArvo());
        System.out.println(a.hProsentti());
        System.out.println("Arvosanajakauma: " + a.arvoSanaJakauma());

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
    }
}
