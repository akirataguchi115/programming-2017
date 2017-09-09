
import java.util.ArrayList;
import javafx.scene.control.Button;

public class Aly {

    private ArrayList<String> vastustajanHistoria;

    public Aly() {
        this.vastustajanHistoria = new ArrayList<>();
    }
    Button kiviNappi = new Button("Kivi");
    Button saksetNappi = new Button("Sakset");
    Button paperiNappi = new Button("Paperi");

    public String pelaa() {
            // aly pelaa jotain
      


        // Muokkaa täällä olevaa toiminnallisuutta
        // Älyn sisältämä lista on ArrayList. Se sisältää tähänastiset
        // pelaajan tekemät siirrot.
        // Sen käsittely onnistuu samalla tavalla kuin listan käsittely aiemmin.
        // Kaikki listalla olevat arvot saa tulostettua komennolla:
        int indeksi = 0;
        while (indeksi < this.vastustajanHistoria.size()) {
            System.out.println(this.vastustajanHistoria.get(indeksi));
            indeksi++;
        }

        // kerrot älyn tekemän valinnan komennolla
        // return "Vaihtoehto";  -- Vaihtoehto voi olla Kivi, Paperi tai Sakset
        return "Sakset";
        // lopeta muokkaus tähän    
    

    public void muista(String siirto) {
        this.vastustajanHistoria.add(siirto);
    }


}

