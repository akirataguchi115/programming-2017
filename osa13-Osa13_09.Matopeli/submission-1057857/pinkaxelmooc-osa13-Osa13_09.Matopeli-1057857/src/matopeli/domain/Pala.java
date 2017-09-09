package matopeli.domain;

public class Pala {

    private int x;
    private int y;

    public Pala(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean osuu(Pala pala) {
        return pala.getX() == getX() && pala.getY() == getY();
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
