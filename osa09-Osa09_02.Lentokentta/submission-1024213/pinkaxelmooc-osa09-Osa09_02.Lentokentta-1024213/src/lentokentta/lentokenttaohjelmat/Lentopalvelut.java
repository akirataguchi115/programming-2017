package lentokentta.lentokenttaohjelmat;

public class Lentopalvelut {
    
    public Lentopalvelut() {
    }
    
    public void tulostakoneet(Lentokentta kentta) {
        kentta.getKoneet().stream().forEach(p -> System.out.println(p.getTunnus()
                + " (" + p.getKapasiteetti() + " henkilöä)"));
        
    }
    
    public void tulostalennot(Lentokentta kentta) {
        kentta.getLennot().stream()
                .forEach(p -> System.out.println(p));
    }
    
    public void tulostatiedot(Lentokentta kentta, String kone) {
        for (int i = 0; i < kentta.getKoneet().size(); i++) {
            if (kentta.getKoneet().get(i).getTunnus().equals(kone)) {
                System.out.println(kentta.getKoneet().get(i).getKokNimi());
            }
        }
    }
    
}
