package saannollisetlausekkeet;

public class Tarkistin {

    public Tarkistin() {

    }

    public boolean onViikonpaiva(String merkkijono) {
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }

    public boolean kaikkiVokaaleja(String merkkijono) {
        return merkkijono.matches("[aeioyuäö]+");
    }

    public boolean kellonaika(String merkkijono) {
        if (merkkijono.matches("[01][0123456789]:[012345][0123456789]:[012345][0123456789]")) {
            return true;
        } else if (merkkijono.matches("[2][0123]:[012345][0123456789]:[012345][0123456789]")) {
            return true;
        }
        return false;
    }
}
