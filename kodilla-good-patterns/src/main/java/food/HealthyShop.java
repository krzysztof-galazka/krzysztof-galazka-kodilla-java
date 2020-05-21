package food;

public class HealthyShop implements SupplierOrderService {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordering: " + orderRequest.getProduct().getProductName());
        return false;
    }
}
