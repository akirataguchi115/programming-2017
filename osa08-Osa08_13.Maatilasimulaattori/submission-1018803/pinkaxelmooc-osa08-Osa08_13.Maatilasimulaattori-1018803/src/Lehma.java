
import java.util.Random;

public class Lehma implements Lypsava, Eleleva {

    private String nimi;
    private double tilavuus;
    private double maara;

    public Lehma() {
        this.tilavuus = 15 + new Random().nextInt(26);
        this.nimi = NIMIA[new Random().nextInt(31)];
        this.maara = 0;
    }

    public Lehma(String nimi) {
        this.tilavuus = 15 + new Random().nextInt(26);
        this.nimi = nimi;
        this.maara = 0;

    }

    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getMaara() {
        return maara;
    }

    @Override
    public String toString() {
        return nimi + " " + Math.ceil(getMaara()) + "/" + getTilavuus();
    }

    @Override
    public double lypsa() {
        double valiDouble = maara;
        maara = 0;
        return valiDouble;

    }

    @Override
    public void eleleTunti() {
        maara += 0.7 + new Random().nextDouble();
        if (maara > tilavuus) {
            maara = tilavuus;
        }
    }

}
