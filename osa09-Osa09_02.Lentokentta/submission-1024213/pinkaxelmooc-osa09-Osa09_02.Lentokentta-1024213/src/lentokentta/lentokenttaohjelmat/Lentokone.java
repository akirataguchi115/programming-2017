package lentokentta.lentokenttaohjelmat;

public class Lentokone {

    private String tunnus;
    private int kapasiteetti;

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
    }

    public String getTunnus() {
        return tunnus;
    }

    public int getKapasiteetti() {
        return kapasiteetti;
    }

    public String getKokNimi() {
        return tunnus + " (" + kapasiteetti + " henkilöä)";
    }

}
