
public class Palkitsija {

    private int kayntiMaara;
    private String etuNimi;
    private int pinkoodi;

    public Palkitsija(String nimi, int pinkoodi) {
        this.kayntiMaara = 0;
        this.etuNimi = nimi;
        this.pinkoodi = pinkoodi;
    }

    public void lisaa() {
        this.kayntiMaara++;
    }

    public String getNimi() {
        return etuNimi;
    }

    public int getMaara() {
        return kayntiMaara;
    } 
    public int getKoodi() {
        return pinkoodi;
    }
}
