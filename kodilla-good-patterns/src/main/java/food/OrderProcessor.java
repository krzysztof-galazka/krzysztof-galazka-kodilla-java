package food;

public class OrderProcessor {

    public boolean order(final OrderRequest orderRequest) throws Exception {
        SupplierOrderService supplier = SupplierFactory.get(orderRequest.getSupplier());
        return supplier.process(orderRequest);
    }
}
