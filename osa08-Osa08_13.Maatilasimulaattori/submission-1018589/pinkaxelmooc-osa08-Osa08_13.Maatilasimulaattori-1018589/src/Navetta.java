
import java.lang.IllegalStateException;
import java.util.Collection;

public class Navetta {

    private Maitosailio sailio;
    private Lypsyrobotti robotti;
    private IllegalStateException virhe;

    public Navetta(Maitosailio maitosailio) {
        this.sailio = maitosailio;
        this.robotti = null;
        this.virhe = new IllegalStateException();
    }

    public Maitosailio getMaitosailio() {
        return sailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        robotti = lypsyrobotti;
    }

    public void hoida(Lehma lehma) {
        if (robotti == null) {
            throw virhe;
        } else {
            sailio.lisaaSailioon(lehma.lypsa());
        }
    }

    public void hoida(Collection<Lehma> lehmat) {
        if (robotti == null) {
            throw virhe;
        } else {
            lehmat.stream().forEach(p -> sailio.lisaaSailioon(p.lypsa()));
        }
    }

    @Override
    public String toString() {
        return sailio.toString();
    }

}
