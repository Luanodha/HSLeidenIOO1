package Week99;

public class SportSchoenen extends SportArtikel {

    public SportSchoenen(double prijs, boolean inStock) {
        super(prijs, inStock);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
