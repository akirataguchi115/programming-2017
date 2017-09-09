
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lukutaito {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        TiedostonLukija tiedLukija = new TiedostonLukija();
        ArrayList<String> luetut = tiedLukija.lueTiedosto("lukutaito.csv");

        double mkeskiarvo
                = luetut.stream()
                        .map(taulukko -> taulukko.split(","))
                        .filter(taulukko -> taulukko[2].contains("male"))
                        .filter(taulukko -> !taulukko[5].isEmpty())
                        .mapToDouble(taulukko -> Double.parseDouble(taulukko[5]))
                        .average()
                        .getAsDouble();

//                        
//                        
        System.out.println("Miesten lukutaidon keskiarvo: " + mkeskiarvo);

        double nkeskiarvo
                = luetut.stream()
                        .map(taulukko -> taulukko.split(","))
                        .filter(taulukko -> taulukko[2].contains("female"))
                        .filter(taulukko -> !taulukko[5].isEmpty())
                        .mapToDouble(taulukko -> Double.parseDouble(taulukko[5]))
                        .average()
                        .getAsDouble();

        System.out.println("Naisten lukutaidon keskiarvo: " + nkeskiarvo);

        ArrayList<String> toinen = 
                 luetut.stream()
                        .map(taulukko -> taulukko.split(","))
                        .filter(taulukko -> !taulukko[5].isEmpty())
                        .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(toinen.get(2));
    }
}
