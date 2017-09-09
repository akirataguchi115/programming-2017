package laatikot;

import java.util.ArrayList;
import java.util.List;

public class MaksimipainollinenLaatikko extends Laatikko {

    private List<Tavara> laatikot;
    private int maksimipaino;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.laatikot = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if ((getPaino() + tavara.getPaino() <= maksimipaino)) {
            laatikot.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (int i = 0; i < laatikot.size(); i++) {
            if (laatikot.get(i).equals(tavara)) {
                return true;
            }
        }
        return false;
    }

    public int getPaino() {
        int yhteispaino
                = laatikot.stream()
                        .mapToInt(p -> (p.getPaino())).sum();
        return yhteispaino;
    }
}
