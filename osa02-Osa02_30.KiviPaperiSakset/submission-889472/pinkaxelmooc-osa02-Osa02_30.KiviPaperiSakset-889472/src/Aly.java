
import java.util.ArrayList;

public class Aly {

    private ArrayList<String> vastustajanHistoria;

    public Aly() {
        this.vastustajanHistoria = new ArrayList<>();
    }

    public String pelaa() {
        // Muokkaa täällä olevaa toiminnallisuutta
        
        // Älyn sisältämä lista on ArrayList. Se sisältää tähänastiset
        // pelaajan tekemät siirrot.
        
        // Sen käsittely onnistuu samalla tavalla kuin listan käsittely aiemmin.
        // Kaikki listalla olevat arvot saa tulostettua komennolla:
        int indeksi = 0;
        while(indeksi < this.vastustajanHistoria.size()) {
            System.out.println(this.vastustajanHistoria.get(indeksi));
            indeksi++;
        }
        
        // kerrot älyn tekemän valinnan komennolla
        // return "Vaihtoehto";  -- Vaihtoehto voi olla Kivi, Paperi tai Sakset
    
           if (indeksi % 2 == 0) {
            return "Sakset";
        } else if (indeksi % 3 == 0) {
            return "Kivi";

        } else {
            return "Paperi";
        }  
        // lopeta muokkaus tähän
        //noni hei emmä saa tästä mitää winwinrobottii
        //tää nyt on sentään iha legit rng peli B) (ainaki jonku aikaa)
        
    }

    public void muista(String siirto) {
        this.vastustajanHistoria.add(siirto);
    }

}
