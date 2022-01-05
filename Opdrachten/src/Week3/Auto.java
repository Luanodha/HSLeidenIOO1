package Week3;

public class Auto {

    private String naam;
    private String kleur;
    private int verkoopPrijs;

    public Auto(String naam, String kleur, int verkoopPrijs) {
        this.naam = naam;
        this.kleur = kleur;
        this.verkoopPrijs = verkoopPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getVerkoopPrijs() {
        return verkoopPrijs;
    }

    public void setVerkoopPrijs(int verkoopPrijs) {
        this.verkoopPrijs = verkoopPrijs;
    }
}
