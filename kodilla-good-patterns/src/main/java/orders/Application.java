package orders;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);

        System.out.printf("Order: ");
        orderProcessor.showRepository();
    }
}
