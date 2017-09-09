package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {

    public static void main(String[] args) {
        launch(VitsiSovellus.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage ikkuna) throws Exception {

        BorderPane asettelu = new BorderPane();

        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);

        Button eka = new Button("Vitsi");
        Button toka = new Button("Vastaus");
        Button kolmas = new Button("Selitys");

        valikko.getChildren().addAll(eka, toka, kolmas);

        asettelu.setTop(valikko);
        
        StackPane ekaAsettelu = luonakyma("What do you call a bear with no teeth?");
        StackPane tokaAsettelu  =luonakyma("A gummy bear.");
        StackPane kolmasAsettelu = luonakyma("Gummy bears have no teeth, but they are BEARS.");
        
        eka.setOnAction(event -> asettelu.setCenter(ekaAsettelu));
        toka.setOnAction(event -> asettelu.setCenter(tokaAsettelu));
        kolmas.setOnAction(event -> asettelu.setCenter(kolmasAsettelu));
        
        asettelu.setCenter(ekaAsettelu);
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    private StackPane luonakyma(String teksti) {
        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);
        
        return asettelu;
    }
}
