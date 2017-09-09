
public class Paaohjelma {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä

        String tiedosto = "src/sanalista.txt";
        Sanatutkimus a = new Sanatutkimus(tiedosto);
        System.out.println(a.kirjaimeenNPaattyvatSanat());
        // kaikki sanat tiedostossa src/sanalista.txt

    }
}
