package suosittelija.domain;

import java.util.Objects;

public class Henkilo {

    private String nimi;

    public Henkilo(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    } 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nimi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Henkilo other = (Henkilo) obj;
        return Objects.equals(this.nimi, other.nimi);
    }
    
}
