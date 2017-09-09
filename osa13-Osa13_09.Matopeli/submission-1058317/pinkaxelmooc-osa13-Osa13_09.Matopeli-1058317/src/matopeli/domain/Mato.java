package matopeli.domain;

import java.util.ArrayList;
import java.util.List;

public class Mato {

    private List<Pala> lista;
    private int alkuX;
    private int alkuY;
    private Suunta suunta;
    private boolean kasva;

    public Mato(int alkuX, int alkuY, Suunta alkusuunta) {
        this.alkuX = alkuX;
        this.alkuY = alkuY;
        this.suunta = alkusuunta;
        this.lista = new ArrayList<>();
        this.kasva = false;
        lista.add(new Pala(alkuX, alkuY));
    }

    public Suunta getSuunta() {
        return suunta;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }

    public int getPituus() {
        return lista.size();
    }

    public List<Pala> getPalat() {
        return lista;
    }

    public void liiku() {
        if (suunta == Suunta.OIKEA) {
            lista.add(new Pala(lista.get(lista.size() - 1).getX() + 1, lista.get(lista.size() - 1).getY()));
            if (kasva) {
            } else if (lista.size() > 3) {
                lista.remove(0);
            }
        } else if (suunta == Suunta.VASEN) {
            lista.add(new Pala(lista.get(lista.size() - 1).getX() - 1, lista.get(lista.size() - 1).getY()));
            if (kasva) {
            } else if (lista.size() > 3) {
                lista.remove(0);
            }
        } else if (suunta == Suunta.ALAS) {
            lista.add(new Pala(lista.get(lista.size() - 1).getX(), lista.get(lista.size() - 1).getY() + 1));
            if (kasva) {
            } else if (lista.size() > 3) {
                lista.remove(0);
            }
        } else if (suunta == Suunta.YLOS) {
            lista.add(new Pala(lista.get(lista.size() - 1).getX(), lista.get(lista.size() - 1).getY() - 1));
            if (kasva) {
            } else if (lista.size() > 3) {
                lista.remove(0);
            }
        }
        kasva = false;
    }

    public void kasva() {
        if (lista.size() < 3) {
            return;
        }
        kasva = true;//jotain tapahtuu tässä
    }

    public boolean osuu(Pala pala) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getX() == pala.getX() && lista.get(i).getY() == pala.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean osuuItseensa() {
        for (int i = 0; i < lista.size(); i++) {
            for (int u = i + 1; u < lista.size(); u++) {
                if (lista.get(i).getX() == lista.get(u).getX() && lista.get(i).getY() == lista.get(u).getY()) {
                    return true;
                }
            }
        }
        return false;
    }
}
