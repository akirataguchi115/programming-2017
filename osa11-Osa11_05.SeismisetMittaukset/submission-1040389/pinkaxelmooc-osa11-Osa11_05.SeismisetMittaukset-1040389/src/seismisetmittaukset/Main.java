package seismisetmittaukset;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MittausRaportoija1 eka = new MittausRaportoija1();
        List<Double> mittausdata = new ArrayList<>();
        double mittaus = 20151004200150175201510050.00200320151007;
        //mittausdata.add(20151004 200 150 175 20151005 0.002 003 20151007); tämä ei toimi
        //ei pysty antamaan Double arvoa välien kanssa, eikä 3:n pisteen kanssa
        //20151004 200 150 175 20151005 0.002 0.03 20151007 ...//
        // voit testata toteutuksesi toimintaa täällä
    }

}
