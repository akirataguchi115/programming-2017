package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis(2006,2017,1);
        NumberAxis yAkseli = new NumberAxis();

        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");

        XYChart.Series yliopistodata = new XYChart.Series();
        yliopistodata.getData().add(new XYChart.Data(2007, 73));
        yliopistodata.getData().add(new XYChart.Data(2008, 68));
        yliopistodata.getData().add(new XYChart.Data(2009, 72));
        yliopistodata.getData().add(new XYChart.Data(2010, 72));
        yliopistodata.getData().add(new XYChart.Data(2011, 74));
        yliopistodata.getData().add(new XYChart.Data(2012, 73));
        yliopistodata.getData().add(new XYChart.Data(2013, 76));
        yliopistodata.getData().add(new XYChart.Data(2014, 73));
        yliopistodata.getData().add(new XYChart.Data(2015, 67));
        yliopistodata.getData().add(new XYChart.Data(2016, 56));

        viivakaavio.getData().add(yliopistodata);
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
