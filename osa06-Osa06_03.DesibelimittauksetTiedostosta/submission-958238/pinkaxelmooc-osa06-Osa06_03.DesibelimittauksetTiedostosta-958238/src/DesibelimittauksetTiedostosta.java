
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class DesibelimittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.parseInt(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.parseInt(lukija.nextLine());

        try {
            Files.lines(Paths.get(tiedosto)).forEach(rivi -> lista.add(Integer.parseInt(rivi)));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        int indeksi = 0;
        int maara = 0;

        while (indeksi < lista.size()) {
            if (lista.get(indeksi) >= alaraja && lista.get(indeksi) <= ylaraja) {
                maara++;
                indeksi++;
            } else {
                indeksi++;
            }
        }
        System.out.println("Lukuja: " + maara);
    }

}
