package kolmeyleisinta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        boolean jatka = true;
        List<String> nimet = new ArrayList<>();
        YleisimmatSanat1 yle1 = new YleisimmatSanat1();
        nimet.add("Pena");
        nimet.add("Kirsi");
        nimet.add("Pena");
        nimet.add("Boi");
        nimet.add("Akira");
        nimet.add("Pena");
        nimet.add("Akira");
        nimet.add("Boi");
        nimet.add("Kirsi");
        System.out.println();
        System.out.println(yle1.yleisetSanat(nimet));
        // voit testata toteutuksesi toimintaa täällä
    }

}
