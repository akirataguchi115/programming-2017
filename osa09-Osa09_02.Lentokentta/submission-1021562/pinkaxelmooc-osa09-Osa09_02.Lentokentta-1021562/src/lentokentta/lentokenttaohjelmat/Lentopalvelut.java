package lentokentta.lentokenttaohjelmat;

public class Lentopalvelut {

    public Lentopalvelut() {

    }

    public void tulostatiedot() {
        System.out.println("moi");
    }

    public void tulostalento() {
        System.out.println("moi");
    }

    public void tulostakoneet(Lentokentta kentta) {
        kentta.getKoneet()
                .entrySet()
                .stream()
                .forEach(p -> System.out.println(p.getKey() + " (" + p.getValue() + ")"));
    }

}
