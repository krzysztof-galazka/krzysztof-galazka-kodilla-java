package challenges.food2door;

public class Delivery {

    private Producer producer;
    private Order order;

    public Delivery(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public void process() {
        boolean isPossible = producer.process(order);
        if (isPossible) {
            System.out.println("Robimy Twoje zamówienie");
        } else {
            System.out.println("Niestety, nie możemy zrealizować Twojego zamówienia");
        }
    }
}
