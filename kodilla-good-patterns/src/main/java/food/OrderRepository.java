package food;

public interface OrderRepository {

    void createOrder(Supplier supplier, Product product);
}
