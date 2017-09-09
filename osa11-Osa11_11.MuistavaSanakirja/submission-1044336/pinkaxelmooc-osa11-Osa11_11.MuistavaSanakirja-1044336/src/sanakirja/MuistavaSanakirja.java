package sanakirja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MuistavaSanakirja {

    private Map<String, String> suen;
    private Map<String, String> ensu;
    private String tiedosto;

    public MuistavaSanakirja(String tiedosto) {
        this.tiedosto = tiedosto;
        this.suen = new HashMap<>();
        this.ensu = new HashMap<>();
    }

    public MuistavaSanakirja() {
        this.suen = new HashMap<>();
        this.ensu = new HashMap<>();
    }

    public void lisaa(String sana, String kaannos) {

        suen.putIfAbsent(sana, kaannos);
        ensu.putIfAbsent(kaannos, sana);

    }

    public String kaanna(String sana) {
        if (suen.containsKey(sana)) {
            return suen.get(sana);
        } else if (ensu.containsKey(sana)) {
            return ensu.get(sana);
        }
        return null;
    }

    public void poista(String sana) {
        if (suen.containsKey(sana)) {
            ensu.remove(suen.get(sana));
            suen.remove(sana);
        } else if (ensu.containsKey(sana)) {
            suen.remove(ensu.get(sana));
            ensu.remove(sana);
        }
    }

    public boolean lataa() {
        File file = new File(tiedosto);
        try {
            Scanner tiedostonLukija = new Scanner(file);
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                suen.put(osat[0], osat[1]);
                ensu.put(osat[1], osat[0]);
            }
        } catch (FileNotFoundException e) {
            return false;
        }
        return true;
    }

    public boolean tallenna() {
        File file = new File(tiedosto);
        List<String> rivit = new ArrayList<>();
        suen.keySet()
                .stream()
                .forEach(p -> rivit.add(p));
        for (int i = 0; i < rivit.size(); i++) {
            String sana = rivit.get(i) + ":" + suen.get(rivit.get(i));
            rivit.set(i, sana);
        }

        try {
            Files.write(Paths.get(tiedosto), rivit, StandardCharsets.UTF_8);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
