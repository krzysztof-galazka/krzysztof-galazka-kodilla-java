package food;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop", new GlutenFreeShopOrderService());
        Product product = new Product("Watter", 5);
        return new OrderRequest(supplier, product);
    }
}
