
import java.util.ArrayList;

public class LintuOhjelma {

    private boolean jatka;
    private ArrayList<String> havaitut;
    private ArrayList<String> linnut;
    private ArrayList<String> latinat;
    private ArrayList<String> tilastot;
    private String haluttuLintu;

    public LintuOhjelma() {
        this.jatka = true;
        this.havaitut = new ArrayList<>();
        this.linnut = new ArrayList<>();
        this.latinat = new ArrayList<>();
        this.tilastot = new ArrayList<>();
        this.haluttuLintu = "";

    }

    public boolean jatka() {
        return jatka;
    }

    public String eiOleOlemassa() {
        return "Ei ole lintu";
    }

    public void lisaaNimi(String nimi) {
        linnut.add(nimi);

    }

    public void havainto(String havainto) {
        for (int i = 0; i < linnut.size(); i++) {   //käydääjn läpi kaikki rekisteröidyt linnut
            if (havainto.equals(linnut.get(i))) {   //jos havainto löytyy linnuista
                havaitut.add(havainto);             //havaintoihin lisätään kyseinen havainto
                return;
            }
        }
        System.out.println(eiOleOlemassa());
    }

    void lisaaLatina(String latina) {
        latinat.add(latina);
    }

    public ArrayList<String> tilasto() {
        for (int i = 0; i < linnut.size(); i++) {
            int maara = 0;
            for (int u = 0; u < havaitut.size(); u++) {
                if (linnut.get(i).equals(havaitut.get(u))) {
                    maara++;
                }
            }
            tilastot.add(linnut.get(i) + " (" + latinat.get(i) + "): " + maara + " havaintoa");
        }
        return tilastot;
    }

    public String nayta(String lintu) {

        for (int i = 0; i < linnut.size(); i++) {   //käydään läpi kaikki rekisteröidyt linnut
            int maara = 0;                          //määrä on aina nolla alussa
            if (linnut.get(i).equals(lintu)) {      //jos haluttu lintu löytyy tietokannasta

                for (int u = 0; u < havaitut.size(); u++) { //käydään läpi kaikki havainnot
                    if (lintu.equals(havaitut.get(u))) {    //aina kun halutusta linnusta on havainto -> maara++;
                        maara++;
                    }
                } haluttuLintu = linnut.get(i) + " (" + latinat.get(i) + "): " + maara + " havaintoa";
            }
            
        }
        return haluttuLintu;
    }

    public void lopeta() {
        jatka = false;
    }

}
