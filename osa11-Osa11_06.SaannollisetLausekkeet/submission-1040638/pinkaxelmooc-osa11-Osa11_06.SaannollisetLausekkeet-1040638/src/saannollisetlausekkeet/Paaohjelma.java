package saannollisetlausekkeet;

public class Paaohjelma {
    
    public static void main(String[] args) {
        Tarkistin tarkistin = new Tarkistin();
        System.out.println(tarkistin.kaikkiVokaaleja("23:23:23"));
        System.out.println(tarkistin.kaikkiVokaaleja("33:33:33"));
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja    
    }
}
