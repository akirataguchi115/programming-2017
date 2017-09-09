
import java.util.ArrayList;
import java.util.List;

public class Peli {

    private String reaalisana;
    private String oikeasana;
    private List<Character> arvatut = new ArrayList<>();
    private int arvaustenmaara;
    private String mask;
    private boolean oikein;
    private String arvaus = "";
    private boolean alku;

    private String sana;

    public Peli(String sana) {
        this.sana = sana;
        this.alustaListat(sana);
        this.reaalisana = "";
        this.arvaustenmaara = 9;
        this.oikein = false;
        this.alku = true;

    }

    public void alustaListat(String sana) {
        int i = 0;
        while (i < sana.length()) {
            reaalisana += "-";
            oikeasana += sana.charAt(i);
            i++;
        }
        this.mask = "";
    }

    public String annaSanaMaskattuna() {
        int i = 0;
        while (i < reaalisana.length()) {
            mask += " " + this.reaalisana.charAt(i);
            i++;
        }
        return "Sana:" + mask;

    }

    public String Arvaustenmaara() {
        return "Arvauksia jäljellä: " + arvaustenmaara;
    }

    public String arvaukset() {
        int i = 0;
        String arvatutsanana = "";
        if (alku == true) {
            alku = false;
            return "Arvatut: ";
        } else {
            while (i < arvatut.size()) {
                arvatutsanana += " " + arvaus;
            }
            return "Arvatut:" + arvaus;
        }
    }

    public String vanhaSana(String uusiarvaus) {
        if (uusiarvaus.equals(arvaus)) {
            return "Olet jo arvannut kyseisen merkin!";
        } else {
            return "";
        }
    }

    public void paivitys(String uusiarvaus) {

        if (oikeasana.contains(uusiarvaus)) {
            int i = 0;
            while (i < oikeasana.length()) {
                if (oikeasana.charAt(i) == (uusiarvaus.charAt(0))) { //MITEN VOI REPLACETA STRINGIN
                    reaalisana = reaalisana.replace(reaalisana.charAt(i), uusiarvaus.charAt(0));
                    oikein = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (oikein == false) {
            arvaustenmaara--;
            arvaus = uusiarvaus;
        }
    }

    public boolean elamat() {
        if (arvaustenmaara > 0) {
            return true;
        } else {
            return false;
        }
    }
}
