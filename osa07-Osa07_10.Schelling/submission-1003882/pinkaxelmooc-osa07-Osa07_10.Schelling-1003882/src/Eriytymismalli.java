
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private int[][] taulukko;
    private int leveys;
    private int korkeus;

    private double prosAlueestaKaytossa;
    private int tyytyvaisyysraja;
    private int ryhmienLukumaara;

    private boolean kaynnissa;

    public Eriytymismalli(int leveys, int korkeus, int tyytyvaisyysraja, int ryhmienLukumaara, double prosAlueestaKaytossa) {
        this.leveys = leveys;
        this.korkeus = korkeus;

        this.taulukko = new int[korkeus][leveys];

        this.tyytyvaisyysraja = tyytyvaisyysraja;
        this.ryhmienLukumaara = ryhmienLukumaara;
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;

        this.kaynnissa = false;
    }

    public void kaynnista() {
        this.kaynnissa = true;
    }

    public void sammuta() {
        this.kaynnissa = false;
    }

    public boolean onKaynnissa() {
        return this.kaynnissa;
    }

    public void asetaRyhmienLukumaara(int ryhmia) {
        this.ryhmienLukumaara = ryhmia;
    }

    public void asetaProsAlueestaKaytossa(double prosAlueestaKaytossa) {
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;
    }

    public void asetaTyytyvaisyysRaja(int tyytyvaisyysraja) {
        this.tyytyvaisyysraja = tyytyvaisyysraja;

    }

    public void alusta() {
        tyhjennaTaulukko();
        arvoAlkuarvot();
    }

    public void tyhjennaTaulukko() {
        for (int i = 0; i < leveys; i++) {
            for (int u = 0; u < korkeus; u++) {
                taulukko[i][u] = 0;
            }
        }
        // Toteuta tänne taulukon tyhjentäminen (aseta jokaisen 
        // alkion arvoksi 0) 

    }

    public void arvoAlkuarvot() {
        Random arpoja = new Random();

        for (int x = 0; x < this.taulukko.length; x++) {
            for (int y = 0; y < this.taulukko[x].length; y++) {
                // arvotaan ensin tuleeko kohtaan mitään

                // Random-luokan metodi nextDouble palauttaa satunnaisen luvun
                // nollan ja yhden välillä
                double satunnainenLukuNollanJaYhdenValilla = arpoja.nextDouble();

                // jos 100*arvo on suurempi kuin prosAlueestaKaytossa, ei 
                // paikkaan aseteta arvoa
                if (100 * satunnainenLukuNollanJaYhdenValilla > prosAlueestaKaytossa) {
                    continue;
                }

                // muulloin arvotaan kohtaan joku ryhmä
                // Random-luokan metodi nextInt(luku) antaa luvun välillä [0, luku[
                this.taulukko[x][y] = 1 + arpoja.nextInt(ryhmienLukumaara);
            }
        }
    }

    public int[][] annaData() {
        return this.taulukko;
    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        for (int i = 0; i < leveys; i++) {
            for (int u = 0; u < korkeus; u++) {
                if (taulukko[i][u] == 0) {
                    Piste piste = new Piste(i, u);
                    tyhjat.add(piste);
                }
            }
        }
        // Luo täällä lista, missä on kaikki tyhjät paikat piste-olioina.
        // Tyhjissä paikoissa on arvo 0

        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            this.taulukko[tyhja.getX()][tyhja.getY()] = this.taulukko[tyytymaton.getX()][tyytymaton.getY()];
            this.taulukko[tyytymaton.getX()][tyytymaton.getY()] = 0;
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        int samanlaisia = 0;
        for (int x = 0; x < leveys; x++) {
            for (int y = 0; y < korkeus; y++) {
                samanlaisia = 0;
                for (int i = -1; i < 2; i++) {
                    for (int u = -1; u < 2; u++) {
                        if (i == 0 && u == 0) {
                        } else {
                            try {
                                if (taulukko[x + i][y + u] == 1) {
                                    samanlaisia++;
                                }
                            } catch (IndexOutOfBoundsException e) {
                                samanlaisia++;
                                // hähää oltiin reunassa, mutta ei anneta häiritä
                            }
                        }
                    }
                }
                if (samanlaisia < tyytyvaisyysraja) {
                    Piste piste = new Piste(x, y);
                    tyytymattomat.add(piste);
                }
            }
        }

// Etsi täällä tyytymättömät
        return tyytymattomat;
    }
}
