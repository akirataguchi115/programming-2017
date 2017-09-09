
public class Paaohjelma {

    public static void main(String[] args) {
        Puhelinmuistio muistio = new Puhelinmuistio();

        muistio.lisaa("Pekka Mikkola", "040-123123");
        muistio.lisaa("Antti Laaksonen", "045-456123");
        muistio.lisaa("Juhana Laurinharju", "050-222333");

        muistio.tulostaKaikki();
    }
}
