
public class Lukutulostin {

    public void lukuporras(int luku) {
        int rivinumero = 1;
        System.out.println(rivinumero);
        rivinumero++;
        while (rivinumero <= luku) {
            int vastaus = 1;
            while (vastaus <= rivinumero) {
                System.out.print(vastaus + " ");
                vastaus++;
            }
            System.out.println();
            rivinumero++;
        }
    }

    public void jatkuvaLukuporras(int luku) {

        int alkuluku = 1;
        int sarake = 1;
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
        int rivinumero = 1;

        System.out.println(leka);
        rivinumero++;
        leka++;

        while (rivinumero <= luku) {
            int muuttuja = 1;
            int vastaus = 0;
            while (muuttuja <= rivinumero) {
                vastaus += leka;
                System.out.print(vastaus + " ");
                muuttuja++;
            }
            leka++;
            rivinumero++;
            System.out.println();
        }
    }
}
