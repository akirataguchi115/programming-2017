
public class Lukutulostin {

    private int luku;

    public void lukuporras(int luku) {
        int rivinumero = 1;
        this.luku = luku;
        while (rivinumero <= luku) {
            int alkuluku = 1;
            while (alkuluku <= rivinumero) {
                System.out.print(alkuluku);
                alkuluku++;
            }
            System.out.println();
            rivinumero++;
        }
    }

    public void jatkuvaLukuporras(int luku) {

        int alkuluku = 1;
        int sarake = 1;
        this.luku = luku;
        int rivinumero = 1;
        int kertoja = 1;
        while (rivinumero <= luku) {
            kertoja = 1;
            while (kertoja <= sarake) {
                System.out.print(alkuluku + " ");
                alkuluku++;
                kertoja++;
            }
            System.out.println();
            rivinumero++;
            sarake++;

        }
    }

    public void kertokolmio(int luku) {

        int leka = 1;
        int tokake = 0;

        while (tokake < luku) {
            int muuttuja = 0;
            System.out.print(leka);
            while (muuttuja < tokake) {
                int vastaus = leka + leka;
                System.out.print(vastaus);
                muuttuja++;
            }
            leka++;
            tokake++;
            System.out.println();
        }
    }
}
