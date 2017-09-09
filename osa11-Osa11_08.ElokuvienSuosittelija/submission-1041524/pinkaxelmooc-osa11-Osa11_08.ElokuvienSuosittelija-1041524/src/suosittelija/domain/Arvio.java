package suosittelija.domain;

public enum Arvio {
    HUONO(-5),
    VALTTAVA(-3),
    EI_NAHNYT(0),
    NEUTRAALI(1),
    OK(3),
    HYVÄ(5)

    private int arvio;
    

private Arvio(int arvio) {
    this.arvio = arvio
}

    public int getArvo() {
        return arvio;
    }
}
