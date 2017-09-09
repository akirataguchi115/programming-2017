
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa = 1000;
        // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        Maksukortti maksukortti = new Maksukortti(maksu);
        maksukortti.otaRahaa(2.50);
        this.rahaa += 2.50;
        if (maksu < 2.50) {
            maksukortti.lataaRahaa(2.50);
            this.rahaa -= 2.50;
            return maksu;
        }
        this.edulliset++;
        return maksu - 2.50;
    }
    // edullinen lounas maksaa 2.50 euroa.
    // kasvatetaan kassan rahamäärää edullisen lounaan hinnalla ja palautetaan vaihtorahat
    // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan

    public double syoMaukkaasti(double maksu) {
        Maksukortti maksukortti = new Maksukortti(maksu);
        maksukortti.otaRahaa(4.30);
        this.rahaa += 4.30;
        if (maksu < 4.30) {
            maksukortti.lataaRahaa(4.30);
            this.rahaa -= 4.30;
            return maksu;
        }
        this.maukkaat++;
        return maksu - 4.30;
        // maukas lounas maksaa 4.30 euroa.
        // kasvatetaan kassan rahamäärää maukkaan lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.saldo() >= 2.50) {
            kortti.otaRahaa(2.50);
            this.edulliset++;
            return true;
        }
        return false;

        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.saldo() >= 4.30) {
            kortti.otaRahaa(4.30);
            this.maukkaat++;
            return true;
        }
        return false;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
        }
    }

    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
