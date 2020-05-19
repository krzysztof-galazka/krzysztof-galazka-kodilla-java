package food;

import java.time.LocalDateTime;

public class SupplierOrderRepository implements OrderRepository {

    @Override
    public void createOrder(Supplier supplier, Product product) {
        System.out.println("Order to: " + supplier + "\n Product: " + product + "\nAmount: " + product.getQuantity());
    }
}
