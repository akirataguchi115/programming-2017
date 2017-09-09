package lukija.ehdot;

import java.util.function.Predicate;

public class KaikkiRivit implements Predicate<String> {

    public KaikkiRivit() {

    }

    @Override
    public boolean test(String t) {
        return true;
    }

}
