package lukija.ehdot;

import java.util.function.Predicate;

public class Ei implements Predicate<String> {

    private Predicate saanto;

    public Ei(Predicate saanto) {
        this.saanto = saanto;
    }

    @Override
    public boolean test(String t) {
        if (saanto.test(t)) {
            return false;
        }
        return true;
    }

}
