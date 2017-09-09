package sovellus;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class KirjoitusharjoitteluSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Sanasto sanasto = new Sanasto();
        Kirjoitusnopeudet kirjoitusnopeudet = new Kirjoitusnopeudet();

        BorderPane borderPane = new BorderPane();

        // sanat vasemmalle laidalle
        Kyselynakyma kyselynakyma = new Kyselynakyma(sanasto);

        // kaavio oikealle laidalle
        Tilastonakyma tilastonakyma = new Tilastonakyma(kirjoitusnopeudet);

        borderPane.setLeft(kyselynakyma.getNakyma());
        borderPane.setRight(tilastonakyma.getNakyma());

        Scene nakyma = new Scene(borderPane);

        List<Long> kirjoitusajat = new ArrayList<>();

        kyselynakyma.getSyoteKentta().setOnKeyReleased((event) -> {
            // 1. onko kirjoitettu sana oikein
            String syotettava = kyselynakyma.syotettavaSana();
            if (syotettava.equals(kyselynakyma.getSyoteKentta().getText())) {
                double kirjoitusnopeus = kirjoitusajat.get(kirjoitusajat.size() - 1) - kirjoitusajat.get(0);
                kirjoitusnopeudet.lisaa(syotettava, kirjoitusnopeus);
                kyselynakyma.uusiSana();
                kirjoitusajat.clear();

                tilastonakyma.paivita();
                return;
            }

            // 2. tilastoidaan kirjoitusnopeutta
            long aika = System.nanoTime();
            kirjoitusajat.add(aika / 1_000_000);
        });

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(KirjoitusharjoitteluSovellus.class);
    }

    public static String toteutettuOminaisuus() {
        return "1.LineChart muutettu BarChartiksi, koska LineChart ei korreloi mitenkään "
                + "muutosnopeuksien kanssa"
                + "2.setAnimated pistettiin trueksi, mikä tosin ei toimi, jos kaavio clearataan, mutta "
                + "toiminnallisuus säilyy kauniimpana clearaamisen poistamisesta lähdekoodista";
    }

}
