package laatikot;

import java.util.ArrayList;
import java.util.List;

public class HukkaavaLaatikko extends Laatikko {

    private List<Tavara> lista;

    public HukkaavaLaatikko() {
        this.lista = new ArrayList<>();

    }

    @Override
    public void lisaa(Tavara tavara) {
        lista.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
}
