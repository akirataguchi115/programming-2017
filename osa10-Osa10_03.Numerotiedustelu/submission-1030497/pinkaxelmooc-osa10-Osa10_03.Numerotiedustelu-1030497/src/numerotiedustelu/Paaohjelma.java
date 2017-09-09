package numerotiedustelu;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Numerotiedustelu a = new Numerotiedustelu();
        a.kaynnista(lukija);
        // tee tästä ohjelmasi käynnistyspiste
        // HUOM: ohjelmassa saa luoda Scanner-olion vain kertaalleen
    }
}
