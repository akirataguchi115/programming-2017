package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

public class Sovelluslogiikka {

    private Kayttoliittyma liittyma;

    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.liittyma = kayttoliittyma;
    }

    public void suorita(int montakertaa) {
        for (int i = 1; i <= montakertaa; i++) {
            System.out.println("Sovelluslogiikka toimii!");
            liittyma.paivita();
        }
    }
}
