
public class Paaohjelma {

    public static void main(String[] args) {

        String lahdeTiedosto = "src/pienilista.txt";
        String kohdeTiedosto = "src/pienilista-sensuroitu.txt";
        // kaikki sanat tiedostossa src/sanalista.txt

         Sensuroija sensuroija = new Sensuroija("selli");
         sensuroija.sensuroi(lahdeTiedosto, kohdeTiedosto);
    }
}
