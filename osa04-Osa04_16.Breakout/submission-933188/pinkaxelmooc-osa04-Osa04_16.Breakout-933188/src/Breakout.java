
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Breakout extends Application {

    public void start(Stage stage) {
        final int pelinLeveys = 480;
        final int pelinKorkeus = 640;

        stage.setTitle("Breakout");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas piirtoalusta = new Canvas(pelinLeveys, pelinKorkeus);
        root.getChildren().add(piirtoalusta);

        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();

        // luodaan maila
        Suorakulmio maila = new Suorakulmio(0, 580, 80, 20, Color.BURLYWOOD);

        // luodaan pallo
        Pallo pallo = new Pallo(pelinLeveys / 2, pelinKorkeus / 2, 10);
        // ja pallon "liike"
        Liike liike = new Liike(0.5, 0.5);

        // luodaan rikottavat palat
        ArrayList<Suorakulmio> palat = new ArrayList<>();

        palat.add(new Suorakulmio(0, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(30, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(60, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(90, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(120, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(150, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(180, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(210, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(240, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(270, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(300, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(330, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(360, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(390, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(420, 15, 30, 15, Color.RED));
        palat.add(new Suorakulmio(450, 15, 30, 15, Color.RED));

        palat.add(new Suorakulmio(0, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(30, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(60, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(90, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(120, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(150, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(180, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(210, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(240, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(270, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(300, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(330, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(360, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(390, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(420, 30, 30, 15, Color.ORANGE));
        palat.add(new Suorakulmio(450, 30, 30, 15, Color.ORANGE));

        palat.add(new Suorakulmio(0, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(30, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(60, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(90, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(120, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(150, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(180, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(210, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(240, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(270, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(300, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(330, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(360, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(390, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(420, 45, 30, 15, Color.BURLYWOOD));
        palat.add(new Suorakulmio(450, 45, 30, 15, Color.BURLYWOOD));

        palat.add(new Suorakulmio(0, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(30, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(60, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(90, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(120, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(150, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(180, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(210, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(240, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(270, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(300, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(330, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(360, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(390, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(420, 60, 30, 15, Color.YELLOW));
        palat.add(new Suorakulmio(450, 60, 30, 15, Color.YELLOW));
        
        palat.add(new Suorakulmio(0, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(30, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(60, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(90, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(120, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(150, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(180, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(210, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(240, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(270, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(300, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(330, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(360, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(390, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(420, 75, 30, 15, Color.DARKSEAGREEN));
        palat.add(new Suorakulmio(450, 75, 30, 15, Color.DARKSEAGREEN));
        
        palat.add(new Suorakulmio(0, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(30, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(60, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(90, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(120, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(150, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(180, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(210, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(240, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(270, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(300, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(330, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(360, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(390, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(420, 90, 30, 15, Color.CORNFLOWERBLUE));
        palat.add(new Suorakulmio(450, 90, 30, 15, Color.CORNFLOWERBLUE));
        
        

// siirretään mailaa kun hiiri liikkuu
        scene.setOnMouseMoved((MouseEvent e) -> {
            maila.setX((int) e.getSceneX() - maila.getLeveys() / 2);
        });

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                piirturi.clearRect(0, 0, pelinLeveys, pelinKorkeus);

                // piirretään maila
                piirturi.setFill(maila.getVari());
                piirturi.fillRect(maila.getX(), maila.getY(), maila.getLeveys(), maila.getKorkeus());

                // piirretään pallo
                piirturi.setFill(Color.CORNFLOWERBLUE);
                piirturi.fillOval(pallo.getX(), pallo.getY(), pallo.getSade() * 2, pallo.getSade() * 2);

                // piirretään rikottavat palat
                int palaIndeksi = 0;
                while (palaIndeksi < palat.size()) {
                    Suorakulmio pala = palat.get(palaIndeksi);
                    piirturi.setFill(pala.getVari());
                    piirturi.fillRect(pala.getX(), pala.getY(), pala.getLeveys(), pala.getKorkeus());
                    palaIndeksi++;
                }

                // liikutetaan palloa
                pallo.liikuta(liike);

                // tarkista osuuko pallo mailaan
                // tarkistetaan osuuko pallo johonkin reunoista
                if (pallo.getY() < 0) {
                    liike.setLiikeY(-1 * liike.getLiikeY());
                }

                if (pallo.getX() < 0) {
                    liike.setLiikeX(-1 * liike.getLiikeX());
                }

                if (pallo.getX() + pallo.getSade() * 2 > pelinLeveys) {
                    liike.setLiikeX(-1 * liike.getLiikeX());
                }

                // jos pallo osuu alalaitaan, lopetetaan peli
                if (pallo.getY() > pelinKorkeus) {
                    ((Stage) root.getScene().getWindow()).close();
                }
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
