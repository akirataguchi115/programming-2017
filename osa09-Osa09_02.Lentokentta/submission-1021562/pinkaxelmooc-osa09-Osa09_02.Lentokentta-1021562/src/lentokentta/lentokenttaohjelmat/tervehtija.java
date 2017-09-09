package lentokentta.lentokenttaohjelmat;

public class tervehtija {

    public tervehtija() {

    }

    public void vaihtoehdot1() {
        System.out.print(
                "Valitse toiminto:\n"
                + "[1] Lisää lentokone\n"
                + "[2] Lisää lento"
                + "\n[x] Poistu hallintamoodista\n"
                + "> ");
    }

    public void vaihtoehdot2() {
        System.out.print("Valitse toiminto:\n"
                + "[1] Tulosta lentokoneet\n"
                + "[2] Tulosta lento\n"
                + "[3] Tulosta lentokoneen tiedot\n"
                + "[x] Lopeta\n"
                + "> ");
    }

    public void tervehdi1() {
        System.out.println("Lentokentän hallinta\n--------------------\n");
    }

    public void tervehdi2() {
        System.out.println("Lentopalvelu\n------------\n");
    }

}
