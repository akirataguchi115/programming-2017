package sovellus;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PuolueetSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis();
        NumberAxis yAkseli = new NumberAxis();

        LineChart<Number, Number> viivakaavio = new LineChart(xAkseli, yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");

        List<String> rivit = new ArrayList<>();

        try {
            Files.lines(Paths.get("puoluedata.tsv")).forEach(rivi -> {
                rivit.add(rivi);
            });
        } catch (Exception e) {
            System.out.println("Virhe " + e.getMessage());
        }
        MapinTekija m = new MapinTekija(rivit);

        Map<String, Map<Integer, Double>> arvot = m.palautaMappi();
        arvot.keySet().stream().forEach(puolue -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(puolue);

            arvot.get(puolue).entrySet().stream().forEach(pari -> {
                data.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));
            });
            viivakaavio.getData().add(data);
        });

        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();

    }

}
