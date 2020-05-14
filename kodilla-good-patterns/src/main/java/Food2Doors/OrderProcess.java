package Food2Doors;

public class OrderProcess {
    private OrderRepository orderRespository;

    public OrderProcess(OrderRepository orderRespository) {
        this.orderRespository = orderRespository;
    }

    public Order run(Producent producent){
        boolean isOrder = producent.process();

        if (isOrder) {
            orderRespository.createOrder(producent.getClass().getSimpleName(), producent.getProduct(), producent.getQuantity());
            return new Order(producent.getProduct(), producent.getQuantity(), true);
        } else {
            return new Order(producent.getProduct(), producent.getQuantity(), false);
        }
    }

}