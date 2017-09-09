package henkilot;

import java.util.ArrayList;
import java.util.List;

public class HenkiloTulostus {

    public HenkiloTulostus() {
    }

    public void tulostaLaitoksenHenkilot(List<Henkilo> henkilot) {
        henkilot.forEach(p -> {
            System.out.println(p.toString());
        });
    }

}
