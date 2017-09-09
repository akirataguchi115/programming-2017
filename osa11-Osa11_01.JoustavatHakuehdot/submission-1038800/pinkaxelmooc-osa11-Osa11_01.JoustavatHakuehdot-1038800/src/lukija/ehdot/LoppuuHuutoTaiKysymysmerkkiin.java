package lukija.ehdot;

import java.util.function.Predicate;

public class LoppuuHuutoTaiKysymysmerkkiin implements Predicate<String> {

    public LoppuuHuutoTaiKysymysmerkkiin() {

    }

    @Override
    public boolean test(String rivi) {
        if(rivi.isEmpty()) {
            return false;
        }
        if (rivi.charAt(rivi.length() - 1) == '!') {
            return true;
        }
        return rivi.charAt(rivi.length() - 1) == '?';
    }
}
