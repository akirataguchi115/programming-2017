package varastot;

public class Tuotevarasto extends Varasto {

    private String tuotenimi;

    public Tuotevarasto(String tuotenimi, double tilavuus) {
        super(tilavuus);
        this.tuotenimi = tuotenimi;
    }

    public String getNimi() {
        return tuotenimi;
    }

    public void setNimi(String uusinimi) {
        this.tuotenimi = uusinimi;
    }

    @Override
    public String toString() {
        return tuotenimi + ": " + super.toString();
    }

}
