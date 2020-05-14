package Food2Doors;

public class OrderRepository {

    public boolean createOrder(String nameFirm, String product, double quantity) {
        System.out.println("Shop: " + nameFirm + ", order: " + product + ", getQuantity: " + quantity);
        return true;
    }
}
