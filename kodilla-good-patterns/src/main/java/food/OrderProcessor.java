package food;

public class OrderProcessor {
    private final InformationService informationService;
    private final SupplierOrderService supplierOrderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final SupplierOrderService supplierOrderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.supplierOrderService = supplierOrderService;
        this.orderRepository = orderRepository;
    }

    public Order order(final OrderRequest orderRequest) {
        boolean isOrderRealized = supplierOrderService.process(orderRequest);
        if (isOrderRealized) {
            informationService.inform(orderRequest.getSupplier(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getSupplier(), orderRequest.getProduct());
            return new Order(orderRequest.getSupplier(), orderRequest.getProduct(), true);
        } else {
            return new Order(orderRequest.getSupplier(), orderRequest.getProduct(), false);
        }
    }
}
