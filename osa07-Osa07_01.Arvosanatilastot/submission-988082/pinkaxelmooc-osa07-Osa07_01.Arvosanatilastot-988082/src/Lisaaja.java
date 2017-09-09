
import java.util.ArrayList;

public class Lisaaja {

    private ArrayList<Integer> lista;
    private boolean jatka;
    private double hyvaksytyt;

    public Lisaaja() {
        this.jatka = true;
        this.lista = new ArrayList<Integer>();
        this.hyvaksytyt = 0;
    }

    public void lisaa(int luku) {
        if (luku == -1) {
            this.jatka = false;
        } else if (luku >= 0 && luku <= 100) {
            this.lista.add(luku);
        }
        if (luku >= 51 && luku <= 100) {
            hyvaksytyt++;
        }
    }

    public boolean hyvaksytytNumerot() {
        return jatka;
    }

    public double keskiArvo() {
        double summa = 0;
        for (int i = 0; i < this.lista.size(); i++) {
            summa += lista.get(i);
        }
        return (summa / (double) lista.size());

    }

    public double hkeskiArvo() {
        double summa = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= 51) {
                summa += lista.get(i);
            }
        }
        return summa / hyvaksytyt;
    }

    public String hProsentti() {
        return "Hyväksymisprosentti: " + 100.0 * hyvaksytyt / lista.size();
    }

    public String tulostaTahti(int kerroin) {
        String tahtia = "";
        for (int i = 0; i < kerroin; i++) {
            tahtia += "*";
        }
        return tahtia;
    }

    String arvoSanaJakauma() {
        int p5 = 0;
        int p4 = 0;
        int p3 = 0;
        int p2 = 0;
        int p1 = 0;
        int hylatty = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < 51) {
                hylatty++;
            } else if (lista.get(i) < 61) {
                p1++;
            } else if (lista.get(i) < 71) {
                p2++;
            } else if (lista.get(i) < 81) {
                p3++;
            } else if (lista.get(i) < 91) {
                p4++;
            } else if (lista.get(i) >= 91) {
                p5++;
            }
        }
        return "\n" + "5: " + tulostaTahti(p5) + "\n" + "4: " + tulostaTahti(p4) + "\n" + "3: " + tulostaTahti(p3) + "\n" + "2: " + tulostaTahti(p2) + "\n" + "1: " + tulostaTahti(p1) + "\n" + "0: " + tulostaTahti(hylatty);

    }
}
