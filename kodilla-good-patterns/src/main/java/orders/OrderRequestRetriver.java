package orders;

public class OrderRequestRetriver {

    public OrderRequest retrieve() {
        User user = new User("Adam", "adam@gmail.com");
        Product product = new Product("box", 1, 100);
        return new OrderRequest(user, product);
    }
}
