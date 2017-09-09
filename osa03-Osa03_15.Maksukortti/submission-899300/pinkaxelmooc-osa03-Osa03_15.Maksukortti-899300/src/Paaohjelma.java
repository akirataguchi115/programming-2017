
public class Paaohjelma {

    public static void main(String[] args) {
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        System.out.print("Pekka: ");
        System.out.println(pekanKortti);
        System.out.print("Matti: ");
        System.out.println(matinKortti);
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
        System.out.print("Pekka: ");
        System.out.println(pekanKortti);
        System.out.print("Matti: ");
        System.out.println(matinKortti);
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        matinKortti.lataaRahaa(50);
        System.out.print("Pekka: ");
        System.out.println(pekanKortti);
        System.out.print("Matti: ");
        System.out.println(matinKortti);

// Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
    }
}
