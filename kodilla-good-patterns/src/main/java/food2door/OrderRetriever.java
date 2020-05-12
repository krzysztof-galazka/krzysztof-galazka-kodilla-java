package food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

    public Order retrieve() {

        Product product1 = new Product("product1", 1);
        Product product2 = new Product("product2", 2);
        Product product3 = new Product("product3", 3);

        Map<Product, Integer> order = new HashMap<>();
        order.put(product1, 300);
        order.put(product2, 5);
        order.put(product3, 2);

        return new Order(order, "223141");
    }
}
