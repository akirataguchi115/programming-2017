package nappijatekstielementti;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstielementtiSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NappiJaTekstielementtiSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        Button napuska = new Button("insert nappinimi hier");
        Label teskusta = new Label("insert label hier");

        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(napuska);
        komponenttiryhma.getChildren().add(teskusta);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
