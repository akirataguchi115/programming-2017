package lentokentta.lentokenttaohjelmat;

public class Lentopalvelut {

    public Lentopalvelut() {

    }

    public void tulostatiedot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void tulostalento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void tulostakoneet(Lentokentta kentta) {
        System.out.println(kentta
                .getKoneet()
                .entrySet()
                .stream()
                .forEach(p -> System.out.println(p.getKey() + " (" + p.getValue() + ")")));
    }

}
