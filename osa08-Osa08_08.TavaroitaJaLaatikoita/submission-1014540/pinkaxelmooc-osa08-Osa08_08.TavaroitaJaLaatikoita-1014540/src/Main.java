
public class Main {

    public static void main(String[] args) {
        Laatikko laatikko = new Laatikko(10);
        Laatikko isolaatikko = new Laatikko(20);

        laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2.0));
        laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 1.0));
        laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 0.7));

        laatikko.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        laatikko.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        laatikko.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));

        isolaatikko.lisaa(laatikko);

        laatikko.lisaa(new Kirja("itse boi", "genes and memes", 2.0));
        laatikko.lisaa(new Kirja("James Bond", "Shaken not stirred", 1.0));
        laatikko.lisaa(new Kirja("Adam Sandler", "Why did god make us", 0.7));

        laatikko.lisaa(new CDLevy("Pink Guy", "Pink Season", 1973));
        laatikko.lisaa(new CDLevy("Owsla", "Full Spring LP", 1975));
        laatikko.lisaa(new CDLevy("Rezz", "Dark hole", 2012));

        isolaatikko.lisaa(laatikko);

        System.out.println(isolaatikko);
        System.out.println(laatikko);
    }

    // testaa täällä luokkiesi toimintaa
}
