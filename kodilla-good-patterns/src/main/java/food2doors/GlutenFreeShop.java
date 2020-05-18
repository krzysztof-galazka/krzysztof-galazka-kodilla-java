package food2doors;

public class GlutenFreeShop implements Producent {
    private String product;
    private double quantity;

    public GlutenFreeShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean process() {
        System.out.println("Order processed: " + product + ", " + quantity);
        return true;
    }
}
