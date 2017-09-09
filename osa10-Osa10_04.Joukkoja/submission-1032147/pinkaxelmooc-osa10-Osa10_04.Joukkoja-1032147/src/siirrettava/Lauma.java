package siirrettava;

import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava {

    private List<Elio> lista;

    public Lauma() {
        this.lista = new ArrayList<>();
    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        lista.add((Elio) siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {
        lista.forEach(p -> {
            p.siirra(dx, dy);
        });
    }

    @Override
    public String toString() {
        List<String> stringit = new ArrayList<>();
        for(int i = 0; i < lista.size(); i++) {
            stringit.add(lista.get(i).toString());
        }
        StringBuilder sb = new StringBuilder();
        for(String s : stringit) {
            sb.append(s);
            sb.append("\n");
        } return sb.toString();
    }

}
