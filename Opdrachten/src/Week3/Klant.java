package Week3;

public class Klant {

    int id;
    String naam;
    int bedrag; // bedrag is hoeveel geld de klant heeft
    Auto auto;

    public Klant(int id, String naam, int bedrag, Auto auto) {
        this.id = id;
        this.naam = naam;
        this.bedrag = bedrag;
        this.auto = auto;
    }
}
