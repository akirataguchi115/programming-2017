
import java.net.URL;
import java.util.Scanner;

public class ChuckNorrisVitsit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int numero = 0;

        while (true) {
            String komento = lukija.nextLine();
            //otetaan vitsin mahdollinen numero talteen
            if (komento.contains(" ")) {
                String[] palat = komento.split(" ");
                numero = Integer.parseInt(palat[1]);
            }

            if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("satunnainen")) {
                try (Scanner skanneri = new Scanner(new URL("http://api.icndb.com/jokes/random/").openStream())) {
                    while (skanneri.hasNextLine()) {
                        System.out.println(skanneri.nextLine());
                    }
                } catch (Exception e) {
                    System.out.println("Virhe: " + e.getMessage());
                }

            } else if (komento.contains("vitsi ")) {
                try (Scanner skanneri = new Scanner(new URL("http://api.icndb.com/jokes/" + numero).openStream())) {
                    while (skanneri.hasNextLine()) {
                        System.out.println(skanneri.nextLine());
                    }
                } catch (Exception e) {
                    System.out.println("Virhe " + e.getMessage());
                }
            }

        }
    }
    // Toteuta vitsien lukeminen tässä
}
