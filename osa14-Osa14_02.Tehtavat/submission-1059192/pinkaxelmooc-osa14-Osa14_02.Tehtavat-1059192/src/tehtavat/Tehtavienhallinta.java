package tehtavat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Tehtavienhallinta {

    private List<Tehtava> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }

    public List<String> tehtavalista() {
        return this.tehtavat.stream()
                .map(t -> t.getNimi()).collect(Collectors.toList());
    }

    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }

    public void merkkaaTehdyksi(String tehtava) {
        this.tehtavat.stream()
                .filter(t -> t.getNimi().equals(tehtava)).forEach(t -> {
            t.setTehty(true);
        });
    }

    public boolean onTehty(String tehtava) {
        return this.tehtavat.stream()
                .filter(t -> t.getNimi().equals(tehtava))
                .filter(t -> t.onTehty()).count() > 0;
    }

    public void poistatehtava(String tehtava) {
        Iterator<Tehtava> iteraattori = tehtavat.iterator();
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getNimi().equals(tehtava)) {
                iteraattori.remove();
            }
        }
    }
}
