package henkilosto;

public class Paaohjelma {

    public static void main(String[] args) {
        Tyontekijat t = new Tyontekijat();
        Henkilo h = new Henkilo("Arto", Koulutus.FT);
        t.lisaa(h);
        t.tulosta(Koulutus.FT);
        // tee testikoodia tänne
    }
}
