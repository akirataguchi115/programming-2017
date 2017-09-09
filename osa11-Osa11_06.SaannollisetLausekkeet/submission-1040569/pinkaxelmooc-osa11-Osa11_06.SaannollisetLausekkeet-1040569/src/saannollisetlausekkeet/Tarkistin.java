package saannollisetlausekkeet;

public class Tarkistin {

    public Tarkistin() {

    }

    public boolean onViikonpaiva(String merkkijono) {
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }

    public boolean kaikkiVokaaleja(String merkkijono) {
        return !merkkijono.matches("a|e|i|o|u|y|");
    }

    public boolean kellonaika(String merkkijono) {
        return merkkijono.matches("[0-20-4]*:[0-50-9]*:[0-50-9]*");
    }
}
