package makihyppy.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tuomarit {
    
    private Random arpoja;
    private List<Integer> lista;
    
    public Tuomarit() {
        this.arpoja = new Random();
        this.lista = new ArrayList<>();
        
    }
    
    public List<Integer> generatePoint() {
        lista.clear();
        for (int i = 0; i < 5; i++) {
            int uusipiste = arpoja.nextInt(11) + 10;
            lista.add(uusipiste);
        }
        return lista;
    }
    
    public int valitsepisteytettävät() {
        Collections.sort(lista);
        lista.remove(lista.get(lista.size() - 1));
        lista.remove(lista.get(0));
        int summa
                = lista.stream()
                        .mapToInt(i -> i)
                        .sum();
        return summa;
    }
    
    public List<Integer> getLista() {
        
        return lista;
        
    }
}
