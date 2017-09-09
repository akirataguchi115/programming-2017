
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;

public class Yhdistin {

    public WritableImage vaalein(final ArrayList<Image> kuvat) {
        int leveys = (int) kuvat.get(0).getWidth();
        int korkeus = (int) kuvat.get(0).getHeight();

        WritableImage kuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kuva.getPixelWriter();

        for (int y = 0; y < korkeus; y++) {
            for (int x = 0; x < leveys; x++) {

                ArrayList<Color> varitPikselissa = kuvienVaritPikselissa(kuvat, x, y);
                double vaaleinPunainen = 0.0;
                double vaaleinVihrea = 0.0;
                double vaaleinSininen = 0.0;

                for (int i = 0; i < varitPikselissa.size(); i++) {
                    Color vari = varitPikselissa.get(i);

                    if (vari.getRed() > vaaleinPunainen) {
                        vaaleinPunainen = vari.getRed();
                    }

                    if (vari.getGreen() > vaaleinVihrea) {
                        vaaleinVihrea = vari.getGreen();
                    }

                    if (vari.getBlue() > vaaleinSininen) {
                        vaaleinSininen = vari.getBlue();
                    }
                }

                kuvanKirjoittaja.setColor(x, y, Color.color(vaaleinPunainen, vaaleinVihrea, vaaleinSininen));
            }
        }

        return kuva;
    }

    public WritableImage tummin(final ArrayList<Image> kuvat) {
        int leveys = (int) kuvat.get(0).getWidth();
        int korkeus = (int) kuvat.get(0).getHeight();

        WritableImage kuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kuva.getPixelWriter();

        for (int y = 0; y < korkeus; y++) {
            for (int x = 0; x < leveys; x++) {

                ArrayList<Color> varitPikselissa = kuvienVaritPikselissa(kuvat, x, y);
                double tumminPunainen = 1.0;
                double tumminVihrea = 1.0;
                double tumminSininen = 1.0;

                for (int i = 0; i < varitPikselissa.size(); i++) {
                    Color vari = varitPikselissa.get(i);

                    if (vari.getRed() < tumminPunainen) {
                        tumminPunainen = vari.getRed();
                    }

                    if (vari.getGreen() < tumminVihrea) {
                        tumminVihrea = vari.getGreen();
                    }

                    if (vari.getBlue() < tumminSininen) {
                        tumminSininen = vari.getBlue();
                    }
                }

                kuvanKirjoittaja.setColor(x, y, Color.color(tumminPunainen, tumminVihrea, tumminSininen));
            }
        }

        return kuva;

    }

    public WritableImage mediaani(final ArrayList<Image> kuvat) {
        int leveys = (int) kuvat.get(0).getWidth();
        int korkeus = (int) kuvat.get(0).getHeight();

        WritableImage kuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kuva.getPixelWriter();

        for (int y = 0; y < korkeus; y++) {
            for (int x = 0; x < leveys; x++) {

                ArrayList<Color> varitPikselissa = kuvienVaritPikselissa(kuvat, x, y);

                ArrayList<Double> punaiset = varitPikselissa.stream() //luodaan punaisille arvoille oma lista
                        .map(i -> i.getRed()) //ainoastaan vihreät värit
                        .sorted() //suuruusjärjestyksessä listalle
                        .collect(Collectors.toCollection(ArrayList::new));
                double mediaaniPunainen = 0;                            //alustetaan mediaanin double-arvo
                if (punaiset.size() % 2 == 0) {                         //listan mediaani kun arvoja on parillinen määrä listassa
                    mediaaniPunainen = ((double) punaiset.get(punaiset.size() / 2) + (double) punaiset.get(punaiset.size()) / 2 - 1) / 2;
                } else {                                                //listan mediaani kun arvoja on pariton määrä listassa
                    mediaaniPunainen = (double) punaiset.get(punaiset.size() / 2);
                }

                ArrayList<Double> vihreat = varitPikselissa.stream()
                        .map(i -> i.getGreen())
                        .sorted()
                        .collect(Collectors.toCollection(ArrayList::new));
                double mediaaniVihrea = 0;
                if (vihreat.size() % 2 == 0) {
                    mediaaniVihrea = ((double) vihreat.get(vihreat.size() / 2) + (double) vihreat.get(vihreat.size()) / 2 - 1) / 2;
                } else {
                    mediaaniVihrea = (double) vihreat.get(vihreat.size() / 2);
                }

                ArrayList<Double> siniset = varitPikselissa.stream()
                        .map(i -> i.getGreen())
                        .sorted()
                        .collect(Collectors.toCollection(ArrayList::new));
                double mediaaniSininen = 0;
                if (siniset.size() % 2 == 0) {
                    mediaaniSininen = ((double) siniset.get(siniset.size() / 2) + (double) siniset.get(siniset.size()) / 2 - 1) / 2;
                } else {
                    mediaaniSininen = (double) siniset.get(siniset.size() / 2);
                }
                kuvanKirjoittaja.setColor(x, y, Color.color(mediaaniPunainen, mediaaniVihrea, mediaaniSininen));
            }
        }

        return kuva;
    }

    public ArrayList<Color> kuvienVaritPikselissa(ArrayList<Image> kuvat, int x, int y) {
        return kuvat.stream().map(k -> k.getPixelReader().getColor(x, y)).collect(Collectors.toCollection(ArrayList::new));
    }

}
