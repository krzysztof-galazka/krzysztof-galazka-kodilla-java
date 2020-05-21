package food;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Product product = new Product("Watter", 5);
        return new OrderRequest(SupplierFactory.EXTRA_FOOD_SHOP, product);
    }
}
