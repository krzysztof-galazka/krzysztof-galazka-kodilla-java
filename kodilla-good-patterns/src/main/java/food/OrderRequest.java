package food;

public class OrderRequest {
    private final String supplier;
    private final Product product;

    public OrderRequest(String supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public String getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "supplier='" + supplier + '\'' +
                ", product=" + product +
                '}';
    }
}
