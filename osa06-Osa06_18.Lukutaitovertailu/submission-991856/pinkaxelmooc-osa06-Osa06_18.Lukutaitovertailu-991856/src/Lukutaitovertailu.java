
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lukutaitovertailu {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lista = new ArrayList<>();

        try (Scanner lukija = new Scanner(new File("lukutaito.csv"))) {
            while (lukija.hasNextLine()) {
                lista.add(lukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
            return;//tietopalkit talletetaan listaan

        }
        ArrayList<String[]> palaset = new ArrayList<>();
        palaset
                = lista.stream()
                        .map(rivi -> rivi.split(","))
                        .collect(Collectors.toCollection(ArrayList::new));
        /*talletetaan String[]-arvoja
                                                                    sisältävään listaan*/

        ArrayList<String[]> oikeaLista = new ArrayList<>();
        oikeaLista
                = palaset.stream()
                        .sorted((p1, p2) -> { //pitäisi vielä jotenkin mappaa prosentit pois
                            Double luku1 = Double.parseDouble(p1[5]);
                            Double luku2 = Double.parseDouble(p2[5]);
                            if (luku1 < luku2) {
                                return -1;
                            } else if (luku2 < luku1) {
                                return 1;
                            } else {
                                return 0;
                            }

                        })
                        .collect(Collectors.toCollection(ArrayList::new)); //talletetaan oikeaan listaan oikeassa järjestyksessä
        oikeaLista.stream().map(p -> p[2] = p[2].substring(0, p[2].length() - 4)).collect(Collectors.toCollection(ArrayList::new));
        //poistetaan prosentit (%)
        oikeaLista.stream().forEach(p -> System.out.println(p[3] + " " + "(" + p[4] + ")," + p[2] + ", " + p[5]));
        //tulostetaan halutussa muodossa ulos järjestyksessä
    }
}
