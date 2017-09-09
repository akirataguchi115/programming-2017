
import java.util.ArrayList;
import java.util.Scanner;

public class Peltipoliisit { 

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> rekkari = new ArrayList<>();
        ArrayList<Integer> nopeus = new ArrayList<>();
        int indeksi = 0;
        int nopeus1 = 1;
        
        while (true) {
            String tieto = lukija.nextLine();
            if (tieto.equals("")) {
                break;
            } else {
                String [] palat = tieto.split(";");
                rekkari.add(palat[indeksi]);
                int speed = palat[nopeus];
                nopeus.add(palat[nopeus]);
                
            }
        }
        indeksi = 0;
        nopeusi = 1;
        
        while(indeksi < lista.size()) {
            String palat [] = (lista.get(indeksi)).split(";");
            if(palat[nopeusi] > 100) {
                System.out.println("ylinopeus");
            }
        }
    }
}
