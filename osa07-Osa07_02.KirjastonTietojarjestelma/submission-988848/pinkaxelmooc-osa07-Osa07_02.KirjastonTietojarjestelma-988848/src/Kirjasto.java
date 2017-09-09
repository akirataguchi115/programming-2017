
import java.util.ArrayList;

public class Kirjasto {

    private ArrayList<Kirja> arkisto;
    private Kirja kirja;

    public Kirjasto() {
        this.arkisto = new ArrayList<>();
    }

    public void lisaaKirja(Kirja uusiKirja) {
        arkisto.add(uusiKirja);
    }

    public void tulostaKirjat() {
        for (int i = 0; i < arkisto.size(); i++) {
            System.out.println(arkisto.get(i).toString());
        }
    }

//    public void haeKirjastosta(ArrayList<Kirja> lista, String nimijulkaisija) {
//        for(int i = 0; i < arkisto.size(); i++) {
//            if(lista.get(i).)
//        }
//    }

    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (int i = 0; i < arkisto.size(); i++) {
            if (arkisto.get(i).nimeke().contains(nimeke)) {
                loydetyt.add(arkisto.get(i));
            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (int i = 0; i < arkisto.size(); i++) {
            if (arkisto.get(i).julkaisija().contains(julkaisija)) {
                loydetyt.add(arkisto.get(i));
            }
        }
        return loydetyt;
    }

    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        for (int i = 0; i < arkisto.size(); i++) {
            if (arkisto.get(i).julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(arkisto.get(i));
            }
        }
        return loydetyt;
    }
}
