package planeettajarjestelma;

public class Planeetta {

    public double xSijainti;
    public double ySijainti;
    public double xNopeus;
    public double yNopeus;
    public double massa;

    public Planeetta(double xSijainti, double ySijainti, double xNopeus, double yNopeus, double massa) {
        this.xSijainti = xSijainti;
        this.ySijainti = ySijainti;
        this.xNopeus = xNopeus;
        this.yNopeus = yNopeus;
        this.massa = massa;
    }

    public double getSijaintiX() {
        return xSijainti;
    }

    public double getSijaintiY() {
        return ySijainti;
    }

    public double getNopeusX() {
        return xNopeus;
    }

    public double getNopeusY() {
        return yNopeus;
    }

    public double getMassa() {
        return massa;
    }

    public void setSijaintiX(double xSijainti) {
        this.xSijainti = xSijainti;
    }

    public void setSijaintiY(double ySijainti) {
        this.ySijainti = ySijainti;
    }

    public void setNopeusX(double xNopeus) {
        this.xNopeus = xNopeus;
    }

    public void setNopeusY(double yNopeus) {
        this.yNopeus = yNopeus;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double etaisyys(Planeetta toinen) {
        double etaisyys = Math.sqrt(Math.pow(Math.abs(this.xSijainti - toinen.getSijaintiX()), 2) + Math.pow(Math.abs(this.ySijainti - toinen.getSijaintiY()), 2));
        return etaisyys;
    }

    public double etaisyysX(Planeetta toinen) {
        double etaisyysX = this.xSijainti - toinen.getSijaintiX();
        return etaisyysX;
    }

    public double etaisyysY(Planeetta toinen) {
        double etaisyysY = this.ySijainti - toinen.getSijaintiY();
        return etaisyysY;
    }

    public double vetovoima(Planeetta toinen) { //muuta tätä abs
        double vetovoima = 6.67384E-11 * (this.massa * toinen.getMassa()) / (this.etaisyys(toinen) * toinen.etaisyys(this));
        return vetovoima;
    }

    public double vetovoimaX(Planeetta toinen) {
        return -vetovoima(toinen) * this.etaisyysX(toinen) / this.etaisyys(toinen);
    }

    public double vetovoimaY(Planeetta toinen) {
        return -vetovoima(toinen) * this.etaisyysY(toinen) / this.etaisyys(toinen);
    }

}
