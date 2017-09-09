
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
            if (lista.get(i).isEmpty()) {

            } else if (lista.get(i).charAt(lista.get(i).length() - 1) == n) {
                annat.add(lista.get(i));
            }
        }
        return annat;
    }

    public String sana(int luku) {
        return lista.get(luku);
    }

    public String palindroi(String sana) {
        String palautus = "";
        for (int i = sana.length() - 1; i >= 0; i--) {
            palautus += sana.charAt(i);
        }
        return palautus;
    }

    public ArrayList<String> palindromit() {
        ArrayList<String> palindromit = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(palindroi(lista.get(i)))) {
                palindromit.add(lista.get(i));
            }
        }
        return palindromit;
    }

    public ArrayList<String> kaikkiVokaalitSisaltavatSanat() {
        ArrayList<String> vokaalit = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).contains("a") && lista.get(i).contains("e") && lista.get(i).contains("i") && lista.get(i).contains("o") && lista.get(i).contains("u") && lista.get(i).contains("y") && lista.get(i).contains("ä") && lista.get(i).contains("ö")) {
                vokaalit.add(lista.get(i));
            }
        }
        return vokaalit;
    }
}
