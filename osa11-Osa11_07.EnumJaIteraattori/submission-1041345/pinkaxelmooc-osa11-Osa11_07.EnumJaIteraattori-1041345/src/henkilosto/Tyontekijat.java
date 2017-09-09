package henkilosto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tyontekijat {

    private List<Henkilo> lista;

    public Tyontekijat() {
        this.lista = new ArrayList<>();

    }

    public void lisaa(Henkilo lisattava) {
        lista.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat.forEach(p -> {
            lista.add(p);
        });
    }

    public void tulosta() {
        Iterator<Henkilo> iteraattori = lista.iterator();

        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next().toString());
        }
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = lista.iterator();

        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus() == koulutus) {
                System.out.println(iteraattori.next().toString());
            }
        }
    }

    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = lista.iterator();

        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
    }

}
