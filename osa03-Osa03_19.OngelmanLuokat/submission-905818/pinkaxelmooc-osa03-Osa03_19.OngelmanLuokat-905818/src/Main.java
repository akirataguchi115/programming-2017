
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Palkitsija matti = new Palkitsija("Matti", 666);
        Palkitsija pekka = new Palkitsija("Pekka", 1234);
        Palkitsija ossi = new Palkitsija("Ossi", 893);
        Palkitsija manuel = new Palkitsija("Manuel", 911);
        Palkitsija ismo = new Palkitsija("Ismo", 112);

        while (true) {
            System.out.println("Syötä plussakortin tunnusluku: "); //naamioidaan tunnuslukulaite boliisien varalta
            int salasana = Integer.parseInt(lukija.next());
            if (salasana == matti.getKoodi()) {
                matti.lisaa();
            } else if (salasana == pekka.getKoodi()) {
                pekka.lisaa();
            } else if (salasana == ossi.getKoodi()) {
                ossi.lisaa();
            } else if (salasana == manuel.getKoodi()) {
                manuel.lisaa();
            } else if (salasana == ismo.getKoodi()) {
                ismo.lisaa();
            } else if (0 == 1/* tähän liitettäisiin kolmas luokka "kello", jonka
                arvoilla vertailtaisiin että kun kello (pvmaara) olisi vierähtä-
                nyt kuukauden (aika == 1 sec * 60*60*24*30) niin tulisi break-komento)*/) {
                System.out.println("Aika");
            } else {
                System.out.println("Plussakortin tunnusluku väärin. Pyydä "
                        + "henkilökunnalta apua, tai yritä uudelleen");
            } 

        
        } /*käytettäisiin Arraylist oliota, jonka avulla syötettäisiin listaan kaikki
        getMaara()-metodilla. Sitten muuttuja voittaja olisi se, jonka getMaara olisi suurin
        . Tämän jälkeen käytettäisiin .remove-toimintoa, joka poistaisi eniten pisteitä saaneen.
        Sitten tulostettaisiin toisiksi eniten saanut, minkä jälkeen ylläpitäjä voi palkita hänet, 
        mikäli ensimmäinen voittaja on ollut viimeksikin jo voittaja*/
        //System.out.println("Vuoden salaseuralainen on: + voittaja)
        //System.out.println("Vuoden salaseuralainen on: + toinenVoittaja)
        
        //oletetaan että ohjelmoija tietää kaikkien 
        //kävijöiden etunimet, ja että kävijät
        //ovat rehellisiä vastatessaan
        //oletetaan myös että kyseinen ohjelma 
        //on käytettävissä vain paikanpäällä
        //oletetaan että salakerhoon pääsee vain kmarketin kautta
        //oletetaan että koodinlukulaite on peitetty kplussa-tarroihin

    }
}
