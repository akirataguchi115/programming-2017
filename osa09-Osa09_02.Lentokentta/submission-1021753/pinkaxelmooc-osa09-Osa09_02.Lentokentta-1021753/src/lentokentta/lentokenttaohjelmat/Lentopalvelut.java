package lentokentta.lentokenttaohjelmat;

public class Lentopalvelut {

    public Lentopalvelut() {
    }

    public void tulostakoneet(Lentokentta kentta) {
        kentta.getKoneet().stream().forEach(p -> System.out.println(p.getTunnus()));
        //getKoneet().palauttaa Lentokone-olioita sisältävän listan.
        //miksei tulostus onnistu? 

    }

    public void tulostalennot(Lentokentta kentta) {
        System.out.println("moi"); //kesken af
    }

    public void tulostatiedot(Lentokentta kentta) {
        System.out.println("moi"); //ei valmis vielä
    }

}
