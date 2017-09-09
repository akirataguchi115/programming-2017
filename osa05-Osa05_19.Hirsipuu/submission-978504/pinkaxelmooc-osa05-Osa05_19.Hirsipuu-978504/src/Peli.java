
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
        this.oikeasana = sana;
        this.alustaListat(sana);
        this.reaalisana = "";
        this.arvaustenmaara = 9;
        this.oikein = false;
        this.alku = true;
        alustaListat(sana);

    }

    public void alustaListat(String sana) {
        int i = 0;
        while (i < sana.length()) {
            reaalisana += "-";
            //oikeasana += sana.charAt(i);
            i++;
        }
        this.mask = "";
    }

    public String annaSanaMaskattuna() {
        int i = 0;
        String mask ="";
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
        String pal = "";
        for (int i=0; i<arvatut.size(); i++) {
            pal += arvatut.get(i) + " ";
        }
        return pal;
    }

    public String vanhaSana(String uusiarvaus) {
        if (arvatut.contains(uusiarvaus)) {
            return "Olet jo arvannut kyseisen merkin!";
        } else {
            return "";
        }
    }

    private boolean onkoArvattu(String uusiarvaus) {
        Character arv = uusiarvaus.charAt(0);
        return arvatut.contains(arv);
    }

    private void lisääArvauksiin(String uusiArvaus) {
        Character arv = uusiArvaus.charAt(0);
        arvatut.add(arv);
    }

    public void paivitys(String uusiArvaus) {
        // rajataan yhteen merkkiin -- huom! oikeasti varmistaa, että väh. 1 merkki
        uusiArvaus = uusiArvaus.substring(0, 1);

        if (this.onkoArvattu(uusiArvaus)) {
            return;
        }
        this.lisääArvauksiin(uusiArvaus);
        if (this.sisältääkö(uusiArvaus)) {
            this.paljasta(uusiArvaus);
        } else {
            this.vääräArvaus();
        }
    }

    private boolean sisältääkö(String uusiArvaus) {
        return oikeasana.contains(uusiArvaus);
    }

    private void paljasta(String uusiArvaus) {
        int i = 0;
        char[] maski = reaalisana.toCharArray();
        while (i < oikeasana.length()) {
            if (oikeasana.charAt(i) == (uusiArvaus.charAt(0))) { //MITEN VOI REPLACETA STRINGIN
                maski[i] = uusiArvaus.charAt(0);
                
            }

            i++;
        }
        reaalisana = new String(maski);

    }

    private void vääräArvaus() {
        arvaustenmaara--;

    }

    public boolean elamat() {
        if (arvaustenmaara > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean voitit() {
        if (reaalisana.equals(oikeasana)) {
            return true;
        } else {
            return false;
        }
    }
}
