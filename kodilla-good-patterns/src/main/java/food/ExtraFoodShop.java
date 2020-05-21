package food;

import java.util.Random;

public class ExtraFoodShop implements SupplierOrderService {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordering: " + orderRequest.getProduct().getProductName());
        Random random = new Random();
        return random.nextBoolean();
    }
}
