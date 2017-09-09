package hiekkaranta;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class HiekkarantaSovellus extends Application {

    public static void main(String[] args) {
        launch(HiekkarantaSovellus.class);
        System.out.println("hi!");
    }

    public static int toteutetutOsat() {
        // muokkaa täällä olevaa arvoa siten, että se kertoo 
        // tekemiesi osan määrän
        return 3;
    }

    @Override
    public void start(Stage ikkuna) {
        Simulaatio simulaatio = new Simulaatio(200, 200);
        Canvas kangas = new Canvas(200, 200);
        GraphicsContext piirturi = kangas.getGraphicsContext2D();
        piirturi.fillRect(0, 0, 200, 200);

        RadioButton metalli = new RadioButton("Metalli");
        RadioButton hiekka = new RadioButton("Hiekka");
        RadioButton vesi = new RadioButton("Vesi");

        VBox palkki = new VBox();
        palkki.getChildren().addAll(metalli, hiekka, vesi);

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(kangas);
        asettelu.setRight(palkki);

        new AnimationTimer() {
            long edellinen = 0;

            @Override
            public void handle(long nykyhetki) {
                if (nykyhetki - edellinen < 100) {
                    return;
                }

                kangas.setOnMouseDragged((event -> {
                    double kohtaX = event.getX();
                    double kohtaY = event.getY();
                    if (metalli.isSelected()) {
                        piirturi.setFill(Color.WHITE);
//                        simulaatio.lisaa((double)kohtaX, (double)kohtaY, Tyyppi.METALLI);
                    } else if (hiekka.isSelected()) {
                        piirturi.setFill(Color.ORANGE);
                    } else if (vesi.isSelected()) {
                        piirturi.setFill(Color.BLUE);
                    } else {
                        piirturi.setFill(Color.BLACK);
                    }
                    piirturi.fillRect(kohtaX, kohtaY, 12, 12);
                }));
                simulaatio.paivita();
            }
        }.start();

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();

    }
}
