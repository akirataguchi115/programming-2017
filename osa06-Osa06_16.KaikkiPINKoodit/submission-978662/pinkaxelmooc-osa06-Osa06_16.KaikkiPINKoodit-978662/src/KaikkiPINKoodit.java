
public class KaikkiPINKoodit {

    public static void main(String[] args) {
        for (int tuhannet = 0; tuhannet < 10; tuhannet++) {
//            System.out.print(tuhannet + " ");
            for (int sadat = 0; sadat < 10; sadat++) {
//                System.out.print(sadat + " ");
                for (int kymmenet = 0; kymmenet < 10; kymmenet++) {
//                    System.out.print(kymmenet + " ");
                    for (int yksikot = 0; yksikot < 10; yksikot++) {
                        System.out.println(tuhannet + sadat + kymmenet + yksikot);
                    }
                }
            }
        }
    }
    // Kirjoita tänne ohjelma joka tulostaa kaikki PIN-koodit

}
