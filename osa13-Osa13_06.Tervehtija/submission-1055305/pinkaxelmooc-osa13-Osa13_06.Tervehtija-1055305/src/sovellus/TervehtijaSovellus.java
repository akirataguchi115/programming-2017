package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {
    
    public static void main(String[] args) {
        System.out.println("Hellow world!");
        launch(TervehtijaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        Label tervehdys = new Label("Kirjoita nimesi ja aloita.");
        Button aloita = new Button("Aloita");
        TextField tekstikentta = new TextField();
        GridPane asettelu = new GridPane();
        
        asettelu.add(tervehdys, 0, 0);
        asettelu.add(tekstikentta, 0, 1);
        asettelu.add(aloita, 0, 2);
        
        asettelu.setPrefSize(300, 180);
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(20, 20, 20, 20));
        
        Label terveteksti = new Label();
        StackPane tervenakyma = new StackPane();
        tervenakyma.setPrefSize(300, 180);
        tervenakyma.getChildren().add(terveteksti);
        tervenakyma.setAlignment(Pos.CENTER);
        
        Scene tervescene = new Scene(tervenakyma);
        
        aloita.setOnAction((event -> {
            terveteksti.setText("Tervetuloa " + tekstikentta.getText() + "!");
            ikkuna.setScene(tervescene);
        }));
        
        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
    
}
