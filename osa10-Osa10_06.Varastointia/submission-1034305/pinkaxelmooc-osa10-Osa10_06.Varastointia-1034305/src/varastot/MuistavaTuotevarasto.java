package varastot;

public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.muutoshistoria = new Muutoshistoria(); //jotain vikaa
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
        if (maara < 0) {
            return 0.0;
        }
        if (maara > saldo) {
            double kaikkiMitaVoidaan = saldo;
            saldo = 0.0;
            return kaikkiMitaVoidaan;
        }
        saldo = saldo - maara;
        muutoshistoria.lisaa(saldo);
        return maara;
        
    }

    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi() + "\nHistoria: " + historia() + "\n"
                + "Suurin tuotemäärä: " + muutoshistoria.maxArvo() + "\n"
                + "Pienin tuotemäärä: " + muutoshistoria.minArvo() + "\n"
                + "Keskiarvo: " + muutoshistoria.keskiarvo() + "\n"
                + "Suurin muutos: " + muutoshistoria.suurinMuutos() + "\n"
                + "Varianssi: " + muutoshistoria.varianssi());
    }
}
