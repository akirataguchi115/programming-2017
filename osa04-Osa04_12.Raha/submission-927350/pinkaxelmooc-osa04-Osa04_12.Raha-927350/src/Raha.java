
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia); // luodaan uusi Raha-olio jolla on oikea arvo
        return uusi;
        // palautetaan uusi Raha-olio
    }

    public boolean vahemman(Raha verrattava) {
        if (this.euroa < verrattava.euroa) {
            return true;
        } else if (this.euroa > verrattava.euroa) {
            return false;
        } else if (this.senttia < verrattava.senttia) {
            return true;
        }
        return false;
    }

    public Raha miinus(Raha vahentaja) {
        int eurot = ((this.euroa * 100 - vahentaja.euroa * 100) + (this.senttia - vahentaja.senttia)) / 100;
        int sentit = this.senttia - vahentaja.senttia;
        if (sentit < 0) {
            sentit = 100 + sentit;
        }
        if ((((this.euroa * 100) - (vahentaja.euroa * 100)) + (this.senttia - vahentaja.senttia)) < 0) {
            eurot = 0;
            sentit = 0;
        }

        Raha erotus = new Raha(eurot, sentit);
        return erotus;

    }
}
