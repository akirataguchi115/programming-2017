package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application {

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage ikkuna) {
        TextField ylateksti = new TextField();
        Button nappi = new Button("Päivitä");
        Label paivitetty = new Label();

        nappi.setOnAction((event) -> {
            paivitetty.setText(ylateksti.getText());
        });

        VBox komponenttiryhma = new VBox();
        komponenttiryhma.setSpacing(0);
        komponenttiryhma.getChildren().addAll(ylateksti, nappi, paivitetty);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
