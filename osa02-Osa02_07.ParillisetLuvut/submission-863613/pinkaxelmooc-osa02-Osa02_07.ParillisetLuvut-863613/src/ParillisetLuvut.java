
public class ParillisetLuvut {

    public static void main(String[] args) {
        int luku = 2;
        System.out.println(luku);
        while (luku % 2 == 0) {
            luku = luku + 2;
            System.out.println(luku);
            if (luku == 100) {
                break;// KIRJOITA OHJELMASI TÄHÄN
            }
        }
    }
}
