
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lukutaito {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        TiedostonLukija tiedLukija = new TiedostonLukija();
        ArrayList<String> luetut = tiedLukija.lueTiedosto("lukutaito.csv");

        OptionalDouble mkeskiarvo
                = luetut.stream()
                        .map(taulukko -> taulukko.split(";"))
                        .filter(taulukko -> taulukko[2].contains("male"))
                        .filter(taulukko -> !taulukko[5].isEmpty())
                        .mapToDouble(taulukko -> Double.parseDouble(taulukko[5]))
                        .average();
        System.out.println(mkeskiarvo);
    }

}
