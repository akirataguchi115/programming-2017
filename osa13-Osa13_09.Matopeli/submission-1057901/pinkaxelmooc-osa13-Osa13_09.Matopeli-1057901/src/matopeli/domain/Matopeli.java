package matopeli.domain;

import java.util.Random;

public class Matopeli {

    private int leveys;
    private int korkeus;
    private Mato mato;
    private Omena omena;

    public Matopeli(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.mato = new Mato(leveys / 2, korkeus / 2, Suunta.ALAS);
        Random random = new Random();
        this.omena = new Omena(random.nextInt(leveys) , random.nextInt(korkeus));

    }

    public Mato getMato() {
        return mato;
    }

    public void setMato(Mato mato) {
        this.mato = mato;
    }

    public Omena getOmena() {
        return omena;
    }

    public void setOmena(Omena omena) {
        this.omena = omena;
    }

    public boolean loppu() {
        if (mato.osuuItseensa()) {
            return true;
        } else if (mato.getPalat().get(mato.getPalat().size() - 1).getX() == leveys || mato.getPalat().get(mato.getPalat().size() - 1).getY() == korkeus) {
            return true;
        } else if (mato.getPalat().get(mato.getPalat().size() - 1).getX() < 0 || mato.getPalat().get(mato.getPalat().size() - 1).getY() < 0) {
            return true;
        } //vaihda rajoja jos testit ei mee läpi
        return false;
    }

    public void paivita() {
        Random random = new Random();
        mato.liiku();
        if (mato.osuu(omena)) {
            mato.kasva();
            boolean jatka = true;
            while (jatka) {
                setOmena(new Omena(random.nextInt(leveys), random.nextInt(korkeus)));
                if (mato.osuu(omena)) {
                    jatka = true;
                }
                jatka = false;
            }
        }
        //loppu();
    }

}
