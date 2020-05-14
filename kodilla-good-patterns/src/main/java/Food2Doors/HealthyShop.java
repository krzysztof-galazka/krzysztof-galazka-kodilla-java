package Food2Doors;

public class HealthyShop implements Producent {
    private String product;
    private double quantity;

    public HealthyShop(String product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    public boolean process() {
        System.out.println("Order processed: " + product + ", " + quantity);
        return true;
    }
}
