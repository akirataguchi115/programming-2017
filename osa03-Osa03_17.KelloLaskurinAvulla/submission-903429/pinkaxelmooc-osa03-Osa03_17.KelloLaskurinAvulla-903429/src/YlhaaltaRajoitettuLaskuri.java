
public class YlhaaltaRajoitettuLaskuri {

    private int arvo;
    private int ylaraja;

    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        this.ylaraja = ylarajanAlkuarvo;
        this.arvo = 0;// kirjoita koodia tähän
    }

    public void seuraava() {
        if (this.arvo == this.ylaraja) {
            this.arvo = 0;
        } else {
            this.arvo++;
        }
        // kirjoita koodia tähän
    }

    public String toString() {
        if (this.arvo < 10) {
            return "0" + this.arvo;
        } else {
            return "" + this.arvo;
        }
        // kirjoita koodia tähän
    }

    public int arvo() {
        return this.arvo;
    }

    public void asetaArvo(int aika) {
        if (aika < 0 ||aika > ylaraja) {
            this.arvo = 0;
        } else {
            this.arvo = aika;
        }
    }
}
