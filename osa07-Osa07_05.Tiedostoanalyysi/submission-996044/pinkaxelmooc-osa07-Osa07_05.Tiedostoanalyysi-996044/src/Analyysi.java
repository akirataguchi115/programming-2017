
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Analyysi {

    private String tiedosto;
    private ArrayList<String> lista;

    public Analyysi(String tiedosto) {
        this.tiedosto = tiedosto;
        this.lista = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto)).forEach(rivi -> lista.add(rivi));
        } catch (IOException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }

    public int rivimaara() {
        return lista.size();
    }

    public int merkkeja() {
        int maara = 0;
        for (int i = 0; i < lista.size(); i++) {
            maara += lista.get(i).length();
            maara++;
        }
        return maara;
    }
}
