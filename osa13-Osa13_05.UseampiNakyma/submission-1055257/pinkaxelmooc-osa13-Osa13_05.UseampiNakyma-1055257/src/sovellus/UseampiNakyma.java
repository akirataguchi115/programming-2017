package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(UseampiNakyma.class);
    }

    @Override
    public void start(Stage ikkuna) {

        BorderPane asettelu = new BorderPane();
        VBox vertikaali = new VBox();
        GridPane ruudukko = new GridPane();
        Scene eka = new Scene(asettelu);
        Scene toka = new Scene(vertikaali);
        Scene kolmas = new Scene(ruudukko);

        asettelu.setTop(new Label("Eka näkyma!"));
        Button nappi1 = new Button("Tokaan näkymään!");
        nappi1.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });
        asettelu.setCenter(nappi1);

        Button nappi2 = new Button("Kolmanteen näkymään!");
        nappi2.setOnAction((event -> {
            ikkuna.setScene(kolmas);
        }));
        vertikaali.getChildren().add(nappi2);
        vertikaali.getChildren().add(new Label("Toka näkymä!"));

        ruudukko.add(new Label("Kolmas näkymä"), 0, 0);
        Button nappi3 = new Button("Ekaan näkymään");
        nappi3.setOnAction((event -> {
            ikkuna.setScene(eka);
        }));
        ruudukko.add(nappi3, 1, 1);

        ikkuna.setScene(eka);
        ikkuna.show();

    }

}
