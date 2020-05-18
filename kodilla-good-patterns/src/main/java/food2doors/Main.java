package food2doors;

public class Main {

    public static void main(String[] args) {

        LoadOrder loadOrder = new LoadOrder();
        Producent producent = loadOrder.load("Watter", 3);
        OrderProcess orderProcess = new OrderProcess(new OrderRepository());
        orderProcess.run(producent);
    }
}
