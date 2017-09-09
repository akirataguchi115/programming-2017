package makihyppy;

import java.util.Scanner;
import makihyppy.domain.TekstiOlio;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        TekstiOlio a = new TekstiOlio();
        a.kaynnista(lukija);

        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on erittäin hyödyllistä.
    }
}
