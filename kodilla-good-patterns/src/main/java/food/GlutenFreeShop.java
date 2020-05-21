package food;

public class GlutenFreeShop implements SupplierOrderService {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordering: " + orderRequest.getProduct().getProductName());
        return true;
    }
}
