package challenges.food2door;

import java.util.Map;

public class Order {
    private Map<Product, Integer> pieces;
    private String orderNumber;

    public Order(Map<Product, Integer> pieces, String orderNumber) {
        this.pieces = pieces;
        this.orderNumber = orderNumber;
    }

    public double orderPrice() {
        double price = 0;
        for (Map.Entry<Product, Integer> entry: pieces.entrySet()) {
            price = price + entry.getKey().getPrice() * entry.getValue();
        }
        return price;
    }

    public Map<Product, Integer> getPieces() {
        return pieces;
    }
}
