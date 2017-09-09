package ristinolla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {
    
    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
        System.out.println("gg ez");
    }
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane komponenttiryhma = new BorderPane();
        
        TextField otsikko = new TextField("Vuoro: X");
        otsikko.setFont(Font.font("Monospaced", 40));
        
        GridPane asettelu = new GridPane();
        
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                Button nappi = new Button("");
                nappi.setFont(Font.font("Monospaced", 40));
                nappi.setOnAction((event) -> {
                    if (nappi.getText().isEmpty()) {
                        if (otsikko.getText().equals("Vuoro: X")) {
                            nappi.setText("X");
                            otsikko.setText("Vuoro: 0");
                        } else if (otsikko.getText().equals("Vuoro: 0")) {
                            nappi.setText("0");
                            otsikko.setText("Vuoro: X");
                        }
                    }
                });
                asettelu.add(nappi, x, y);
            }
        }
        
        if(asettelu.getChildren().get(1).GetText().equals("X")) {
            if(asettelu.getChildren.get...)
        }
        komponenttiryhma.setTop(otsikko);
        komponenttiryhma.setCenter(asettelu);
        Scene nakyma = new Scene(komponenttiryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
}
