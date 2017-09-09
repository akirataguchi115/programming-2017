package suosittelija;

import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;

public class Main {

    public static void main(String[] args) {
        Henkilo henkilo = new Henkilo("Pekka");
        Elokuva elokuva = new Elokuva("Eraserhead");

        System.out.println(henkilo.getNimi() + " ja " + elokuva.getNimi());
        // Testaa luokkiesi toteutusta täällä
    }
}
