package painoindeksi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RaportinLuoja2 implements Raportoiva {

    RaportinLuoja2() {
    }

    @Override
    public PainoindeksiRaportti painoindeksiRaportti(List<Henkilo> henkilotiedot) {
        List<String> alipainoiset
                = henkilotiedot.stream()
                        .filter(p -> p.getIndeksi() < 18.5)
                        .map(p -> p.getNimi())
                        .collect(Collectors.toCollection(ArrayList::new));
        List<String> normaalipainoiset
                = henkilotiedot.stream()
                        .filter(p -> p.getIndeksi() < 25)
                        .map(p -> p.getNimi())
                        .collect(Collectors.toCollection(ArrayList::new));
        List<String> ylipainoiset
                = henkilotiedot.stream()
                        .filter(p -> p.getIndeksi() < 30)
                        .map(p -> p.getNimi())
                        .collect(Collectors.toCollection(ArrayList::new));
        List<String> merkylipainoiset
                = henkilotiedot.stream()
                        .filter(p -> p.getIndeksi() >= 30)
                        .map(p -> p.getNimi())
                        .collect(Collectors.toCollection(ArrayList::new));
        return new PainoindeksiRaportti(alipainoiset, normaalipainoiset, ylipainoiset, merkylipainoiset);
    }
}
