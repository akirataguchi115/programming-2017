
public class VahenevaLaskuri {

    private int arvo;
    private int alku;// oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.alku = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if (this.arvo != 0) {
            this.arvo = this.arvo - 1;
            // kirjoita tänne metodin toteutus
            // laskurin arvon on siis tarkoitus vähentyä yhdellä
        }

        // ja tänne muut metodit
    }

    public void nollaa() {
        this.arvo = 0;
    }

    public void palautaAlkuarvo() {
        this.arvo = this.alku;
    }
}
