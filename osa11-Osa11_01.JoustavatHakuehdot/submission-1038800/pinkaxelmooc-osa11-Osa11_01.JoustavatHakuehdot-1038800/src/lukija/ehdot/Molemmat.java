package lukija.ehdot;

import java.util.function.Predicate;

public class Molemmat implements Predicate<String> {

    private Predicate huutomerkit;
    private Predicate paattyy;

    public Molemmat(Predicate huutomerkit, Predicate paattyy) {
        this.huutomerkit = huutomerkit;
        this.paattyy = paattyy;
    }

    @Override
    public boolean test(String t) {
        if (huutomerkit.test(t)) {
            return paattyy.test(t);
        }
        return false;

    }

}
