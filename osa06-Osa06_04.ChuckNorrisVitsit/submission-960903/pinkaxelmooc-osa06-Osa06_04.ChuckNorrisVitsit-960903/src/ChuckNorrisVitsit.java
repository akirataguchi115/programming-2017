
import java.util.Scanner;

public class ChuckNorrisVitsit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true) {
            String komento = lukija.nextLine();
            
            if(komento.equals("lopeta")) {
                break;
            } else if (komento.equals("satunnainen")) {
                try (Scanner skanneri = new Scanner (new URL("http://api.icndb.com/jokes/random/").openStream())) {
                    while(skanneri.hasNextLine()){
                        System.out.println(skanneri.nextLine());
                    }
                }
            } else if (komento.equals("vitsi " + numero)) {
            
        }
        }
        // Toteuta vitsien lukeminen tässä
    }
}
