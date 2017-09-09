package painoindeksi;

import java.util.ArrayList;
import java.util.List;

public class RaportinLuoja1 implements Raportoiva {

    public RaportinLuoja1() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        List<String> alipainoiset = new ArrayList<>();
        List<String> normaalipainoiset = new ArrayList<>();
        List<String> ylipainoiset = new ArrayList<>();
        List<String> merkylipainoiset = new ArrayList<>();
        for (int i = 0; i < henkilotiedot.size(); i++) {
            if (henkilotiedot.get(i).getIndeksi() < 18.5) {
                alipainoiset.add(henkilotiedot.get(i).getNimi());
            } else if (henkilotiedot.get(i).getIndeksi() < 25) {
                normaalipainoiset.add(henkilotiedot.get(i).getNimi());
            } else if (henkilotiedot.get(i).getIndeksi() < 30) {
                ylipainoiset.add(henkilotiedot.get(i).getNimi());
            } else {
                merkylipainoiset.add(henkilotiedot.get(i).getNimi());
            }
        }
        return new PainoindeksiRaportti(alipainoiset, normaalipainoiset, ylipainoiset, merkylipainoiset);
    }
}
