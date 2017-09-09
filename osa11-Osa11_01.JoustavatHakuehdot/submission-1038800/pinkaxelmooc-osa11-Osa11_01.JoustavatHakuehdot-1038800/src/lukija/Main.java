package lukija;

import java.util.function.Predicate;
import lukija.ehdot.*;

public class Main {

    public static void main(String[] args) {
        String osoite = "http://www.gutenberg.org/cache/epub/52537/pg52537.txt";
        GutenbergLukija kirja = new GutenbergLukija(osoite);

        Predicate ehto = new VahintaanYksi(
                new SisaltaaSanan("jalokivi"),
                new SisaltaaSanan("kulta"),
                new SisaltaaSanan("hopea")
        );

        kirja.rivitJoilleVoimassa(ehto).stream().forEach(rivi -> {
            System.out.println(rivi);
        });
    }
}
