package sovellus;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Kyselynakyma {

    private Sanasto sanasto;
    private TextField syotekentta;
    private Label syotettavaSana;

    public Kyselynakyma(Sanasto sanasto) {
        this.sanasto = sanasto;
    }

    public Parent getNakyma() {
        GridPane asettelu = new GridPane();
        this.syotettavaSana = new Label(sanasto.annaSana());
        this.syotekentta = new TextField();

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));

        asettelu.add(syotettavaSana, 0, 0);
        asettelu.add(syotekentta, 0, 1);

        return asettelu;
    }

    public String syotettavaSana() {
        return this.syotettavaSana.getText();
    }

    public TextField getSyoteKentta() {
        return this.syotekentta;
    }

    public void uusiSana() {
        syotettavaSana.setText(sanasto.annaSana());
        syotekentta.clear();
    }
}
