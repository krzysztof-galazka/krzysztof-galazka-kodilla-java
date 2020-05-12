package challenges.food2door;

import java.util.Map;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> resources;

    public ExtraFoodShop(Map<Product, Integer> resources) {
        this.resources = resources;
    }

    private boolean orderVerifier(Map<Product, Integer> order) {
        for (Map.Entry<Product, Integer> entry: order.entrySet()) {
            if (entry.getValue() < 0 || entry.getValue() > resources.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean process(Order order) {
        if (orderVerifier(order.getPieces())) {
            System.out.println("ExtraFoodShop " +
                    "Kwota zamówienia: " + order.orderPrice());
            return true;
        }
        System.out.println("ExtraFoodShop nie może w tej chwili zrealizować zamówienia");
        return false;
    }
}
