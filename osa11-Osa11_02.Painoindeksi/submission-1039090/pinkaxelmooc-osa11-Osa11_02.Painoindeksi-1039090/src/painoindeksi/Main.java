package painoindeksi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Henkilo> lista = new ArrayList<>();
        boolean jatka = true;
        while (jatka) {
            String nimi = lukija.nextLine();
            Double pituus = Double.parseDouble(lukija.nextLine());
            Double paino = Double.parseDouble(lukija.nextLine());
            int syke = Integer.parseInt(lukija.nextLine());
            lista.add(new Henkilo(nimi, pituus, paino, syke));
            jatka = Boolean.parseBoolean(lukija.nextLine());
        }
        RaportinLuoja1 eka = new RaportinLuoja1();
        RaportinLuoja2 toka = new RaportinLuoja2();
        System.out.println(eka.painoindeksiRaportti(lista).getAlipainoiset());
        System.out.println(eka.painoindeksiRaportti(lista).getNormaalipainoiset());
        System.out.println(eka.painoindeksiRaportti(lista).getYlipainoiset());
        System.out.println(eka.painoindeksiRaportti(lista).getMerkittavastiYlipainoiset());
        
        System.out.println(toka.painoindeksiRaportti(lista).getAlipainoiset());
        System.out.println(toka.painoindeksiRaportti(lista).getNormaalipainoiset());
        System.out.println(toka.painoindeksiRaportti(lista).getYlipainoiset());
        System.out.println(toka.painoindeksiRaportti(lista).getMerkittavastiYlipainoiset());
        // voit testata toteutuksesi toimintaa täällä
    }

}
