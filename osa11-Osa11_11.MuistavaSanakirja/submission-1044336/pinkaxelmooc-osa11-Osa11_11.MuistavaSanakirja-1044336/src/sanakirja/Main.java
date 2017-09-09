package sanakirja;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MuistavaSanakirja s = new MuistavaSanakirja("src/sanat.txt");
        s.lataa();
        s.kaanna("monkey");
        // Testaa sanakirjaa täällä
    }
}
