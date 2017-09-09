package lukija.ehdot;

import java.util.function.Predicate;

public class PituusVahintaan implements Predicate<String> {

    private int vahintaan;

    public PituusVahintaan(int vahintaan) {
        this.vahintaan = vahintaan;
    }

    @Override
    public boolean test(String t) {
        if (t.isEmpty()) {
            return false;
        }
        return t.length() >= vahintaan;
    }
}
