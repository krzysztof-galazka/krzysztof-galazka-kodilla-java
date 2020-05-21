package food;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor();

        boolean result = false;
        try {
            result = orderProcessor.order(orderRequest);
        } catch (Exception e) {
            System.out.println("Supplier not supported");
        }
        System.out.println(result);
    }
}
