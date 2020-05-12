package challenges.food2door;

public class Main {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProducerResourcesRetriever resourcesRetriever = new ProducerResourcesRetriever();
        Producer producer = new ExtraFoodShop(resourcesRetriever.retrieve());

        Delivery deliveryProcessor = new Delivery(producer, order);
        deliveryProcessor.process();
    }
}