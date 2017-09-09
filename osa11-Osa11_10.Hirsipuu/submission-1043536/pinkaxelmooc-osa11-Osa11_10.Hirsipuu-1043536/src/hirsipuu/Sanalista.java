package hirsipuu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sanalista {

    private List<String> sanat;

    public Sanalista(List<String> sanat) {
        this.sanat = sanat;
    }

    public List<String> sanat() {
        return this.sanat;
    }

    public Sanalista sanatJoidenPituusOn(int pituus) {
        List<String> uudet
                = sanat.stream().filter(p -> p.length() == pituus)
                        .collect(Collectors.toCollection(ArrayList::new));
        return new Sanalista(uudet);
    }

    public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain) {
        List<String> uudet
                = sanat.stream().filter(p -> p.indexOf(kirjain) < 0)
                        .collect(Collectors.toCollection(ArrayList::new));
        return new Sanalista(uudet);
    }

    public Sanalista sanatJoissaMerkit(String merkkijono) {
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < sanat.size(); i++) {
            boolean lisaa = true;
            for (int u = 0; u < merkkijono.length(); u++) {
                if (merkkijono.length() != sanat.get(i).length() || merkkijono.charAt(u) == '-') {
                } else if (merkkijono.charAt(u) != sanat.get(i).charAt(u)) {
                    lisaa = false;
                }
            }
            if (lisaa) {
                lista.add(merkkijono);
            }
        }
        return new Sanalista(lista);
    }

    public int koko() {
        return sanat.size();
    }
}
