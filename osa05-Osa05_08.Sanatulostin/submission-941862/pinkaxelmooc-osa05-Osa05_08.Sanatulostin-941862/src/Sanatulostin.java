
public class Sanatulostin {

    private String sana;

    public Sanatulostin(String sana) {
        this.sana = sana;

    }

    public void sanaporras(int luku) {
        int indeksi = 0;
        int rivinumero = 0;
        int max = 1;

        while (rivinumero < luku) {
            int kirjaimia = 0;
            while (kirjaimia < max) {
                if (indeksi > sana.length() - 1) {
                    indeksi = 0;
                }
                System.out.print(sana.charAt(indeksi));
                indeksi++;
                kirjaimia++;

            }
            max++;
            rivinumero++;
            System.out.println();

        }
    }

    public void laskevaSanaporras(int luku) {
        int indeksi = 0;

        while (luku > 0) {
            int kirjaimia = 0;
            while (kirjaimia < luku) {
                if (indeksi > sana.length() - 1) {
                    indeksi = 0;
                }
                System.out.print(sana.charAt(indeksi));
                indeksi++;
                kirjaimia++;

            }
            luku--;
            System.out.println();
        }
    }

    public void sanapyramidi(int luku) {
        int indeksi = 0;
        int rivinumero = 0;
        int max = 1;

        while (rivinumero < luku) {
            int kirjaimia = 0;
            while (kirjaimia < max) {
                if (indeksi > sana.length() - 1) {
                    indeksi = 0;
                }
                System.out.print(sana.charAt(indeksi));
                indeksi++;
                kirjaimia++;

            }
            max++;
            rivinumero++;
            System.out.println();

        }
        luku -= 1;
        while (luku > 0) {
            int kirjaimia = 0;
            while (kirjaimia < luku) {
                if (indeksi > sana.length() - 1) {
                    indeksi = 0;
                }
                System.out.print(sana.charAt(indeksi));
                indeksi++;
                kirjaimia++;

            }
            luku--;
            System.out.println();
        }
    }
}
