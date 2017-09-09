
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä
        String tiedosto = "src/testitiedosto.txt";
        Analyysi a = new Analyysi(tiedosto);
        System.out.println(a.rivimaara());
        
    }
}
