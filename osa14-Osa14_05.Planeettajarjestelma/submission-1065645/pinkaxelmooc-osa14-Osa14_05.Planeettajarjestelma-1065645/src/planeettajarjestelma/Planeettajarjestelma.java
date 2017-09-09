package planeettajarjestelma;

import java.util.List;

public class Planeettajarjestelma {

    private List<Planeetta> planeetat;
    private double halkaisija;

    public Planeettajarjestelma(List<Planeetta> planeetat, double halkaisija) {
        this.planeetat = planeetat;
        this.halkaisija = halkaisija;
    }

    public List<Planeetta> getPlaneetat() {
        return planeetat;
    }

    public void paivita(double ajanmuutos) {

        for (int i = 0; i < planeetat.size(); i++) {
            double summaX = 0;
            double summaY = 0;
            double kiihdytysX;
            double kiihdytysY;
            for (int u = 0; u < planeetat.size(); u++) {
                if (i == u) {
                    //skip
                } else {
                    summaX += planeetat.get(i).vetovoimaX(planeetat.get(u));
                    summaY += planeetat.get(i).vetovoimaY(planeetat.get(u));
                }
            }
            kiihdytysX = summaX / planeetat.get(i).getMassa();
            kiihdytysY = summaY / planeetat.get(i).getMassa();
            double nopeusX = planeetat.get(i).getNopeusX() + ajanmuutos * kiihdytysX;
            double nopeusY = planeetat.get(i).getNopeusY() + ajanmuutos * kiihdytysY;
            planeetat.get(i).setNopeusX(nopeusX);
            planeetat.get(i).setNopeusY(nopeusY);
            planeetat.get(i).setSijaintiX(planeetat.get(i).getSijaintiX() + ajanmuutos * nopeusX);
            planeetat.get(i).setSijaintiY(planeetat.get(i).getSijaintiY() + ajanmuutos * nopeusY);
        }
        //the hardest part
    }

}
