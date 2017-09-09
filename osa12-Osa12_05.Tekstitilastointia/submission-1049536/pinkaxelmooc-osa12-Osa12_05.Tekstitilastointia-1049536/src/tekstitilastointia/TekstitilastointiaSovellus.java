package tekstitilastointia;

import javafx.application.Application;
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
        napit.getChildren().add(new Label("Kirjaimia: 0"));
        napit.getChildren().add(new Label("Sanoja: 0"));
        napit.getChildren().add(new Label("Pisin sana on:"));

        asettelu.setBottom(napit);
        asettelu.setCenter(new TextArea());

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
