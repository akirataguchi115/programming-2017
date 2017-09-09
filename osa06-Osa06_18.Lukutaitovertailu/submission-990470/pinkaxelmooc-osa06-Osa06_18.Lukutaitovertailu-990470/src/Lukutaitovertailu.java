
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        } catch (IOException e) {
            System.out.println("Virhe: " + e.getMessage()); //tietopalkit talletetaan listaan

        }
        ArrayList<String[]> palaset = new ArrayList<>();
        palaset = 
                lista.stream()
                .map(rivi -> rivi.split(","))
                .collect(Collectors.toCollection(ArrayList::new)); /*talletetaan String[]-arvoja
                                                                    sisältävään listaan*/
        System.out.println(Double.parseDouble(palaset.get(0)[5])); //tässä pystyy parsemaan 
        
        ArrayList<String[]> oikeaLista = new ArrayList<>();
        oikeaLista = 
                palaset.stream()
                .sorted((p1,p2) -> {
                    return Double.parseDouble(p1[5]) - Double.parseDouble(p2[5]); //tässä ei?
                })
                .collect(Collectors.toCollection(ArrayList::new)); //talletetaan oikeaan listaan oikeassa järjestyksessä
        
//        oikeaLista.stream().forEach(p -> System.out.println("moi"));
    } 
//.forEach(p -> System.out.println(p[3] + " " + "(" + p[4] + "), " + p[2] + ", " + p[5]))
}
