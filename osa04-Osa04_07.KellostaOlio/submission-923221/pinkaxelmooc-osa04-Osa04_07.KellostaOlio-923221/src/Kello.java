
public class Kello {

    private YlhaaltaRajoitettuLaskuri tunnit;
    private YlhaaltaRajoitettuLaskuri minuutit;
    private YlhaaltaRajoitettuLaskuri sekunnit;

    public Kello(int tunnitAlussa, int minuutitAlussa, int sekunnitAlussa) {
        tunnit.asetaArvo(tunnitAlussa);

        minuutit.asetaArvo(minuutitAlussa);

        sekunnit.asetaArvo(sekunnitAlussa);
        // luodaan kello joka asetetaan parametrina annettuun aikaan
    }

    public void etene() {
        sekunnit.seuraava();
        // kello etenee sekunnilla
    }

    public String toString() {
        // palauttaa kellon merkkijonoesityksen
        return "" + tunnit.arvo() + " : " + minuutit.arvo() + " : " + sekunnit.arvo() + " : ";
    }
}
