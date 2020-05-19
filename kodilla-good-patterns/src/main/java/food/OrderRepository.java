package food;

import java.time.LocalDateTime;

public interface OrderRepository {

    void createOrder(Supplier supplier, Product product);
}
