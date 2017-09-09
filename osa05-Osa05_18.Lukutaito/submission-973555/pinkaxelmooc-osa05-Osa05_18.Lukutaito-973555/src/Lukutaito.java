
import java.util.ArrayList;
import java.util.OptionalDouble;
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
                        .filter(taulukko -> !taulukko[2].contains("female"))
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

        Double suurin
                = luetut.stream()
                        .map(taulukko -> taulukko.split(","))
                        .filter(taulukko -> !taulukko[5].isEmpty())
                        .mapToDouble(taulukko -> Double.parseDouble(taulukko[5]))
                        .max()
                        .getAsDouble();

        String isoin = String.valueOf(suurin);

        int indeksi = 0;
        String maarivi = "alkuarvo";
        while (true) {
            if (luetut.get(indeksi).contains(isoin)) {
                maarivi = luetut.get(indeksi);
                break;
            } else {
                indeksi++;
            }
        }
        String[] palat = maarivi.split(",");
        String suurinmaa = palat[3];

//        System.out.println(suurin);
        //somehow collect the table to an ArrayList
//        int indeksi = 0;
//        String suurinmaa = "alkuarvo";
//        while (indeksi < lista.size()) {
//
//            if (lista.get(indeksi).equals(isoin)) {
//                suurinmaa = lista.get(indeksi - 1);
//                break;
//            } else {
//                indeksi++;
//            }
//        }
        System.out.println("Korkein lukutaito on maassa: " + suurinmaa);
//suurin.getAsDouble()
        //int indeksi = 0;
        //while(indeksi < toinen.size()) {
        //    double pala = Double.parseDouble(toinen.get(indeksi))
        //}
    }
}
