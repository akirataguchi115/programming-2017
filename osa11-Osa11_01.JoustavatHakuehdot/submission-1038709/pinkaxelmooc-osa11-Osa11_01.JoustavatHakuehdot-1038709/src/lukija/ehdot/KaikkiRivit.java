package lukija.ehdot;

import java.util.function.Predicate;

public class KaikkiRivit implements Predicate {

    public KaikkiRivit() {

    }

    @Override
    public boolean test(Object t) {
        return true;
    }

}
