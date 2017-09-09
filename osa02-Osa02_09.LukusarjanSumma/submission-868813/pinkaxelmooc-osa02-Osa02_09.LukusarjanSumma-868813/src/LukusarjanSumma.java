
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti? ");
        int asti = 3;
        int kierros = 0;
        int luku = 0;
        int summa = 0;
        
    while(kierros < asti) {
        summa = luku + luku++;
        luku++;
        kierros++;
    } System.out.println("Summa on " + summa);
    } 
}
