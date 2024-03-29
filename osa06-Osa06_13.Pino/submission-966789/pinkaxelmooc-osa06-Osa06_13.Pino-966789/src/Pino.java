
public class Pino {

    private String[] taulukko;
    private int arvoja;

    public Pino() {
        this.taulukko = new String[5];
    }

    public void lisaa(String arvo) {
        if (this.arvoja >= this.taulukko.length) {
            this.kasvata();
        }

        this.taulukko[this.arvoja] = arvo;
        this.arvoja++;
    }

    public void kasvata() {
        String[] kopio = new String[taulukko.length + 5];
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            kopio[indeksi] = taulukko[indeksi];
            indeksi++;
        }
        taulukko = kopio;
        // Lisää kasvatustoiminnallisuus tänne! 

    }

    public String poista() {
        if (this.arvoja == 0) {
            return null;
        }

        this.arvoja--;
        return this.taulukko[this.arvoja];
    }

    public int koko() {
        return this.arvoja;
    }

    public String[] getTaulukko() {
        return taulukko;
    }
}
