package laatikot;

import java.util.ArrayList;
import java.util.List;

public class YhdenTavaranLaatikko extends Laatikko {

    private Tavara sisalto;

    public YhdenTavaranLaatikko() {

    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.sisalto == null) {
            this.sisalto = tavara;
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.sisalto == null) {
        } else if (this.sisalto.equals(tavara)) {
            return true;
        }
        return false;
    }

}
