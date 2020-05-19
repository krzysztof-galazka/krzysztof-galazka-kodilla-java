package food;

public class OrderRequest {
    private final Supplier supplier;
    private final Product product;

    public OrderRequest(final Supplier supplier, final Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }


    @Override
    public String toString() {
        return "OrderRequest {" +
                "user=" + supplier +
                ", product=" + product +
                '}';
    }
}
