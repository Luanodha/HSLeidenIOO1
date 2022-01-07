package Week99;

public class SportArtikel {

    private double prijs;
    private boolean inStock;

    public SportArtikel(double prijs, boolean inStock) {
        this.prijs = prijs;
        this.inStock = inStock;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
