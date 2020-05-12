package challenges.food2door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Realizujemy twoje zamówienie");
        return true;
    }
}
