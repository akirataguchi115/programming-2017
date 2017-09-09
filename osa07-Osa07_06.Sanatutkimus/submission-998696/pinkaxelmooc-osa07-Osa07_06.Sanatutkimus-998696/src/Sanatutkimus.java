
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Sanatutkimus {

    private ArrayList<String> lista;

    public Sanatutkimus(String tiedosto) {
        this.lista = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto), StandardCharsets.UTF_8
            ).forEach(sana -> lista.add(sana));
        } catch (Exception ex) {
        }
    }

    public int sanojenMaara() {
        int maara = 0;
        for (int i = 0; i < lista.size(); i++) {
            maara++;
        }
        return maara;
    }

    public ArrayList<String> kirjaimenZSisaltavatSanat() {
        ArrayList<String> zetat = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).contains("z")) {
                zetat.add(lista.get(i));
            }
        }
        return zetat;
    }

    public ArrayList<String> kirjaimeenNPaattyvatSanat() { // mikä tässä mättää
        ArrayList<String> annat = new ArrayList<>();
        char n = 'n';
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).charAt(lista.get(i).length()) == n) {
                annat.add(lista.get(i));
            }
        }
        return annat;
    }
}
