package orders;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements Repository {
    private List<OrderRequest> orderRequests;

    public OrderRepository() {
        orderRequests = new ArrayList<>();
    }

    @Override
    public boolean add(OrderRequest orderRequest) {
        return orderRequests.add(orderRequest);
    }

    public void show() {
        orderRequests.stream()
                .map(orderRequest -> orderRequest.getUser().getName() + " : " + orderRequest.getProduct().getName())
                .forEach(System.out::println);
    }
}
