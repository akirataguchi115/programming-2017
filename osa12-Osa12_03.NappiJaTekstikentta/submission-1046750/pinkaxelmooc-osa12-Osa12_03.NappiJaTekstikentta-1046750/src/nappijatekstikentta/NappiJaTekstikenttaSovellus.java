package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstikenttaSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NappiJaTekstikenttaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        Button nappi = new Button(":^)");
        TextField tekstikentta = new TextField(";')");
        
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(tekstikentta);
        
        Scene nakyma = new Scene(komponenttiryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

}
