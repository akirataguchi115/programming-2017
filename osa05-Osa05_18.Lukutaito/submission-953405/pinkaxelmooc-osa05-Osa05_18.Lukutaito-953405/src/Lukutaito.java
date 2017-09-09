
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lukutaito {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        TiedostonLukija tiedLukija = new TiedostonLukija();
        ArrayList<String> luetut = tiedLukija.lueTiedosto("lukutaito.csv");
        ArrayList<String> lista = new ArrayList<>();

        double mkeskiarvo
                = luetut.stream()
                        .map(merkkijono -> merkkijono.split(";"))
                        .filter(taulukko -> taulukko[2].contains("male"))
                        .filter(taulukko -> !taulukko[5].isEmpty())
                        .forEach(taulukko -> Double.parseDouble(taulukko[5]))
                        .average();
                        System.out.println(mkeskiarvo);
    }

}