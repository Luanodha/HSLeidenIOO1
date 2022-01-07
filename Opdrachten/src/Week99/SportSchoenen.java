package Week99;

public class SportSchoenen extends SportArtikel {
    private String type;
    public SportSchoenen(double prijs, boolean inStock, String type) {
        super(prijs, inStock);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
