
import java.util.ArrayList;
import java.util.List;


public class Paaohjelma {

    public static void main(String[] args) {
        List<String> nimet = new ArrayList<>();
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("kolmas");

        System.out.println(new ListanTarkistin().palautaKoko(nimet));
        // tee tänne testikoodia

    }

}
