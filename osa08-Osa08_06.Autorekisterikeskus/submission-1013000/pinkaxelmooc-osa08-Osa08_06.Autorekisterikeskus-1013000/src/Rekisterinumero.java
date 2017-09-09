
public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }
        Rekisterinumero verrattava = (Rekisterinumero) object;

        if (this.maa != verrattava.maa) {
            return false;
        }

        if (this.rekNro != verrattava.rekNro) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.maa.hashCode() + this.rekNro.hashCode();
    }
}
