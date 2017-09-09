package siirrettava;

public class Elio implements Siirrettava {

    private int x;
    private int y;

    public Elio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void siirra(int dx, int dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }
}
