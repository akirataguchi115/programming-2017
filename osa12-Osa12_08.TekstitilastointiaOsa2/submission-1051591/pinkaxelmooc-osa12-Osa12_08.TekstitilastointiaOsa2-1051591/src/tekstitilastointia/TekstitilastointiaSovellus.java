package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TekstitilastointiaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();

        HBox napit = new HBox();
        napit.setSpacing(5);
        Label marks = new Label("Kirjaimia: 0");
        Label words = new Label("Sanoja: 0");
        Label longest = new Label("Pisin sana on:");
        napit.getChildren().addAll(marks, words, longest);

        asettelu.setBottom(napit);
        TextArea tekstikentta = new TextArea();
        asettelu.setCenter(tekstikentta);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();

        tekstikentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            marks.setText("Kirjaimia: " + merkkeja);
            words.setText("Sanoja: " + sanoja);
            longest.setText("Pisin sana on: " + pisin);// asetetaan arvot tekstielementteihin
        });
    }
}
