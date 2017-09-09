package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class EpareiluaMainontaaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        CategoryAxis xAkseli = new CategoryAxis();
        NumberAxis yAkseli = new NumberAxis(76, 77.6,1);
        yAkseli.setTickLabelsVisible(false);
        yAkseli.setLabel("Suurempi parempi!");

        BarChart<String, Number> pylvaskaavio = new BarChart<>(xAkseli, yAkseli);

        pylvaskaavio.setTitle("Liittymän nopeus");
        pylvaskaavio.setLegendVisible(false);

        XYChart.Series asukasluvut = new XYChart.Series();
        asukasluvut.getData().add(new XYChart.Data("NDA", 77.4));
        asukasluvut.getData().add(new XYChart.Data("Tomera", 77.2));
        asukasluvut.getData().add(new XYChart.Data("Liisa", 77.1));
        asukasluvut.getData().add(new XYChart.Data("Ratiolinja", 77.1));
        asukasluvut.getData().add(new XYChart.Data("Pete", 76.2));

        pylvaskaavio.getData().add(asukasluvut);
        Scene nakyma = new Scene(pylvaskaavio, 400, 300);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(EpareiluaMainontaaSovellus.class);
    }

}
