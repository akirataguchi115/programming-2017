
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Sensuroija {

    private ArrayList<String> lista;
    private String sana;

    public Sensuroija(String sana) {
        this.sana = sana;
        this.lista = new ArrayList<>();
    }

    public void sensuroi(String lahdetiedosto, String kohdetiedosto) {
        try {
            Files.lines(Paths.get(lahdetiedosto)).forEach(rivi -> lista.add(rivi));
        } catch (IOException e) {
            System.out.println("Lukeminen epäonnistui. Virhe: " + e.getMessage());
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).contains(sana)) {
                lista.remove(i);
            }
            try {
                Files.write(Paths.get(kohdetiedosto), lista, StandardCharsets.UTF_8);
            } catch (Exception e) {
                System.out.println("Virhe tiedostoon kirjoittamisessa: " + e.getMessage());
            }
        }

    }

    public ArrayList<String> tulosta() {
        return lista;
    }
}
