package lentokentta.lentokenttaohjelmat;

public class Lentopalvelut {

    public Lentopalvelut() {

    }

    public void tulostakoneet(Lentokentta kentta) {
        kentta.getKoneet()
                .entrySet()
                .stream()
                .forEach(p -> System.out.println(p.getKey() + " (" + p.getValue() + " henkilöä)"));
    }

    public void tulostalennot(Lentokentta kentta) {
        for (int i = 0; i < kentta.getLennot().size(); i++) {
            kentta.getKoneet().get();
        }
        System.out.println("moi");
    }

    public void tulostatiedot(Lentokentta kentta) {
        System.out.println("moi"); //ei valmis vielä
    }

}
