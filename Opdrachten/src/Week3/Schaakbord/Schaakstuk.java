package Week3.Schaakbord;

public class Schaakstuk {

    private String naam;
    private String kleur;

    public Schaakstuk(String naam, String kleur) {
        this.naam = naam;
        this.kleur = kleur;
    }

    public String getNaam() {
        return naam;
    }

    public String getKleur() {
        return kleur;
    }
}
