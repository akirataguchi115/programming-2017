
import java.util.ArrayList;
import java.util.Scanner;

public class FillarointiaBaanallaOsa2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String vuosi = lukija.nextLine();
        String kuukausi = lukija.nextLine();

        TiedostonLukija tiedLukija = new TiedostonLukija();
        ArrayList<String> pyorailijat = tiedLukija.lueTiedosto("helsingin-pyorailijamaarat.csv");

        double keskiarvo
                = pyorailijat.stream()
                        .map(merkkijono -> merkkijono.split(";"))
                        .filter(taulukko -> taulukko[0].contains(vuosi))
                        .filter(taulukko -> taulukko[0].contains(kuukausi))
                        .filter(taulukko -> !taulukko[taulukko.length-1].isEmpty())
                        .mapToInt(taulukko -> Integer.parseInt(taulukko[taulukko.length-1]))
                        .average().getAsDouble();

        System.out.println();
        System.out.println("Pyöräilijöitä keskimäärin tunnissa: " + keskiarvo);
        System.out.println("Pyöräilijöitä keskimäärin päivässä: " + (24.0 * keskiarvo));
    }
}
