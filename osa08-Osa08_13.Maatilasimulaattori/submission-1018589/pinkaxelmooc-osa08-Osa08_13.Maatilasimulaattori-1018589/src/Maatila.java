
import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva {
    
    private String omistaja;
    private Navetta navetta;
    private List<Lehma> lista;
    
    public Maatila(String nimi, Navetta navetta) {
        this.omistaja = nimi;
        this.navetta = navetta;
        this.lista = new ArrayList<>();
    }
    
    @Override
    public void eleleTunti() {
        if (lista.isEmpty()) {
            
        } else {
            lista.stream().forEach(p -> p.eleleTunti());
        }
    }
    
    public String getOmistaja() {
        return omistaja;
    }
    
    @Override
    public String toString() {
        if (lista.isEmpty()) {
            return "Maatilan omistaja: " + getOmistaja() + "\n" + "Navetan maitosäilio: "
                    + navetta.getMaitosailio().toString() + "\n" + "Ei lehmiä.";
        }
        return "Maatilan omistaja: " + getOmistaja() + "\n" + "Navetan maitosäilio: "
                + navetta.getMaitosailio().toString() + "\n" + "lehmät: \n"
                + lista.toString();
        
    }
    
    public void lisaaLehma(Lehma lehma) {
        lista.add(lehma);
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robo) {
        navetta.asennaLypsyrobotti(robo);
    }
    
    public void hoidaLehmat() {
        navetta.hoida(lista);
    }
}
