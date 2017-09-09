
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

        OptionalDouble mkeskiarvo
                = luetut.stream()
                        .map(merkkijono -> merkkijono.split(";"))
                        .filter(tieto -> tieto[2].contains("male"))
                        .filter(tieto -> !tieto[5].isEmpty())
                        .mapToDouble(tieto -> Double.parseDouble(tieto))
                        .average();
                        System.out.println(mkeskiarvo);
    }

}
