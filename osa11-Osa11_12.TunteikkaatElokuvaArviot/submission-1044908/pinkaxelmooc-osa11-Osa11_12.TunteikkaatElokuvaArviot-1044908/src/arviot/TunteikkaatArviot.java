package arviot;

import java.util.Arrays;
import java.util.List;

public class TunteikkaatArviot {
    
    private List<String> lista;

    // Huom! Älä muuta konstruktorin parametrien määrää -- konstruktoria
    // saa toki muuten muuttaa
    public TunteikkaatArviot(List<String> rivit) {
        this.lista = rivit;
    }
    
    public int sanojenLukumaara(String sana) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
        }
        String[] palat = sb.toString().split(" ");
        int maara = 0;
        for (String palat1 : palat) {
            if (palat1.equalsIgnoreCase(sana)) {
                maara++;
            }
        }
        return maara;
    }
    
    public double sananTunne(String sana) {
        Double yhteissumma = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).contains(sana)) {
                yhteissumma += 2;
            } else {
                String[] palat = lista.get(i).split(" ");
                for (int u = 1; u < palat.length; u++) {
                    if (palat[u].equalsIgnoreCase(sana)) {
                        yhteissumma += Double.parseDouble(palat[0]);
                    }
                }
            }
        }
        return yhteissumma / (double) lista.size();
    }
    
    public String sananTunneMerkkijonona(String sana) {
        if (sananTunne(sana) <= 1.9) {
            return "negatiivinen";
        } else if (sananTunne(sana) <= 2.1) {
            return "neutraali";
        }
        return "positiivinen";
    }
    
    public double lauseenTunne(String lause) {
        Double yhteissumma = 0.0;
        String[] parts = lause.split(" ");
        for(int i = 0; i < parts.length; i++) {
            yhteissumma += sananTunne(parts[i]);
        } return yhteissumma / (double)parts.length;
    }
    
    public String lauseenTunneMerkkijonona(String lause) {
        if (lauseenTunne(lause) <= 1.9) {
            return "negatiivinen";
        } else if (lauseenTunne(lause) <= 2.1) {
            return "neutraali";
        }
        return "positiivinen";
    }
    
}
