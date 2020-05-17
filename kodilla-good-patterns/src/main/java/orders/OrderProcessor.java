package orders;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public boolean process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if (isOrdered) {
            informationService.sendConfirmation(orderRequest);
            orderRepository.add(orderRequest);
            return true;
        }
        else {
            return false;
        }
    }

    public void showRepository() {
        orderRepository.show();
    }

}
