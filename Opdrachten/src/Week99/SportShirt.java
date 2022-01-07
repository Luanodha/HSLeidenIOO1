package Week99;

public class SportShirt extends SportArtikel {

    private boolean bedrukt;

    public SportShirt(double prijs, boolean inStock, boolean bedrukt) {
        super(prijs, inStock);
        this.bedrukt = bedrukt;
    }

    public boolean getBedrukt() {
        return bedrukt;
    }

    public void setBedrukt(boolean bedrukt) {
        this.bedrukt = bedrukt;
    }
}
