package food2door;

import java.util.HashMap;
import java.util.Map;

public class ProducerResourcesRetriever {

    public Map<Product, Integer> retrieve() {
        Product product1 = new Product("product1", 1);
        Product product2 = new Product("product2", 2);
        Product product3 = new Product("product3", 3);

        Map<Product, Integer> resources = new HashMap<>();
        resources.put(product1, 127);
        resources.put(product2, 253);
        resources.put(product3, 97);

        return resources ;
    }
}
