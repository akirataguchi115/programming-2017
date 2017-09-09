package varastot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Muutoshistoria {

    private List<Double> historia;

    public Muutoshistoria() {
        this.historia = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        historia.add(tilanne);

    }

    public void nollaa() {
        historia.clear();
    }

    @Override
    public String toString() {
        return historia.toString();
    }

    public double maxArvo() {
        if (historia.isEmpty()) {
            return 0;
        }
        return Collections.max(historia);
    }

    public double minArvo() {
        if (historia.isEmpty()) {
            return 0;
        }
        return Collections.min(historia);
    }

    public double keskiarvo() {
        if (historia.isEmpty()) {
            return 0;
        }
        double summa = historia.stream().mapToDouble(p -> p).sum();
        double average = summa / historia.size();
        return average;
    }

    public double suurinMuutos() {
        if (historia.isEmpty()) {
            return 0;
        }
        double sMuutos = 0;
        for (int i = 1; i < historia.size(); i++) {
            Double muutos = Math.abs(historia.get(i - 1) - historia.get(i));
            if (muutos > sMuutos) {
                sMuutos = muutos;
            }
        }
        return sMuutos;
    }

    public double varianssi() {
        if (historia.isEmpty() || historia.size() == 1) {
            return 0;
        }
        double keskiarvo = keskiarvo();
        double ostosVarianssiIlmanjakoa = 0;
        for (int i = 0; i < historia.size(); i++) {
            ostosVarianssiIlmanjakoa += Math.pow((historia.get(i) - keskiarvo), 2);
        }
        double varianssi = ostosVarianssiIlmanjakoa / (historia.size() -1);
        return varianssi;
    }
}
