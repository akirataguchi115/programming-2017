package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    public static void main(String[] args) {
        launch(HymioSovellus.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage ikkuna) {

        Canvas piirtoalusta = new Canvas(640, 480);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();


        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);

        piirturi.setFill(Color.BLACK);
        piirturi.fillRect(150, 20, 50, 50);
        piirturi.fillRect(300, 20, 50, 50);
        piirturi.fillRect(100, 170, 50, 50);
        piirturi.fillRect(350, 170, 50, 50);
        piirturi.fillRect(150, 220, 50, 50);
        piirturi.fillRect(200, 220, 50, 50);
        piirturi.fillRect(250, 220, 50, 50);
        piirturi.fillRect(300, 220, 50, 50);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
