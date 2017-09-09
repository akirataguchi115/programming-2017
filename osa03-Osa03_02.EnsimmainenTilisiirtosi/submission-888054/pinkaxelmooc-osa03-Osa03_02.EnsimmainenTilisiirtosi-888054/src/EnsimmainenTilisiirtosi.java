
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        Tili MatinTili = new Tili("Matin tili", 1000.0);
        Tili OmaTili = new Tili("Oma tili", 0.0);
        MatinTili.otto(100.0);
        OmaTili.pano(100.0);
        System.out.println(MatinTili);
        System.out.println(OmaTili);
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
    }
}
