package varastot;

public class MuistavaTuotevarasto extends Tuotevarasto {
    
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(alkuSaldo); //jotain vikaa
        lisaaVarastoon(alkuSaldo); //jotain vikaa
    }
    
    public String historia() {
        return muutoshistoria.toString();
    }    
    
    @Override
    public void lisaaVarastoon(double maara) {
        saldo += maara;
        muutoshistoria.lisaa(saldo);
    }    
    
    @Override
    public double otaVarastosta(double maara) {
        saldo -= maara;
        muutoshistoria.lisaa(saldo);
        return maara;
    }
}
