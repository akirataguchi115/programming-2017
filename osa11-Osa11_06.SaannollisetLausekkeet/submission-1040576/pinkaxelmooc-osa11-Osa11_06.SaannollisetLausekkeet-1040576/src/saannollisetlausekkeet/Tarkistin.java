package saannollisetlausekkeet;

public class Tarkistin {

    public Tarkistin() {

    }

    public boolean onViikonpaiva(String merkkijono) {
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }

    public boolean kaikkiVokaaleja(String merkkijono) {
        return !merkkijono.matches("b*c*d*f*g*h*j*k*l*m*n*p*r*s*t*v*z");
    }

    public boolean kellonaika(String merkkijono) {
        return merkkijono.matches("[0-2][0-3]*:[0-5][0-9]*:[0-5][0-9]*");
    }
}
