package planeettajarjestelma;

import java.util.ArrayList;
import java.util.List;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PlaneettajarjestelmaSovellus extends Application {

    static List<Planeetta> planeetat = new ArrayList<>();
    static Planeettajarjestelma jarjestelma = new Planeettajarjestelma(planeetat, 5.0E11);

    public static void main(String[] args) {
        Planeetta aurinko = new Planeetta(538771.2647179796, 311728.01914265234, 0.15944610708562912, 0.15099663888466472, 1.989E30);
        Planeetta merkurius = new Planeetta(-2.3423738558153862E10, -5.363391883276512E10, 43168.9924212314, -19555.612648233368, 3.302E23);
        Planeetta venus = new Planeetta(-1.2257733349672739E10, 1.0688994731967513E11, -34980.88986158969, -3903.1360711941647, 4.869E24);
        Planeetta maa = new Planeetta(7.649815710400691E10, 1.2825871174194992E11, -25608.972746907584, 15340.707015973465, 5.974E24);
        Planeetta mars = new Planeetta(1.9433739848583844E11, 1.1855926503806793E11, -12591.918312354934, 20580.315270396313, 6.419E23);

        jarjestelma.getPlaneetat().add(aurinko);
        jarjestelma.getPlaneetat().add(merkurius);
        jarjestelma.getPlaneetat().add(venus);
        jarjestelma.getPlaneetat().add(maa);
        jarjestelma.getPlaneetat().add(mars);
        launch(PlaneettajarjestelmaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        Canvas piirtoalusta = new Canvas(320, 240);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);

        new AnimationTimer() {
            long edellinen = 0;
            double halkaisija = 5.0E11;

            @Override
            public void handle(long now) {
                if (now - edellinen < 600000000) {
                    return;
                }
                piirturi.clearRect(0, 0, 320, 240);
                for (int i = 0; i < jarjestelma.getPlaneetat().size(); i++) {

                    double leveys = 320;
                    double korkeus = 240;
                    piirturi.fillOval(leveys / 2 + leveys * jarjestelma.getPlaneetat().get(i).getSijaintiX() / halkaisija, korkeus / 2 + korkeus * jarjestelma.getPlaneetat().get(i).getSijaintiY() / halkaisija, 10, 10);
                    jarjestelma.paivita(3423.0);

                }

            }

        }.start();
        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
