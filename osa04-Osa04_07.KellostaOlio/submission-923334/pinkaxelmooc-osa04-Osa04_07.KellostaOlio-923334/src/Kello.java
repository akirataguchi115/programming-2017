
public class Kello {

    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        tunnit = new YlhaaltaRajoitettuLaskuri(23);
        tunnit.asetaArvo(tunnitAlussa);
        this.minuutit = new YlhaaltaRajoitettuLaskuri(59);
        minuutit.asetaArvo(minuutitAlussa);
        this.sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        sekunnit.asetaArvo(sekunnitAlussa);
    }
    // luodaan kello joka asetetaan parametrina annettuun aikaan

    public void etene() {
        sekunnit.seuraava();
        if (sekunnit.arvo() == 0) {
            minuutit.seuraava();
            if (minuutit.arvo() == 0) {
                tunnit.seuraava();
            }
        } else if (minuutit.arvo() == 0 && sekunnit.arvo() == 0) {
            tunnit.seuraava();
        }
        // kello etenee sekunnilla
    }

    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return "" + tunnit.toString() + ":" + minuutit.toString() + ":" + sekunnit.toString();
    }
}
