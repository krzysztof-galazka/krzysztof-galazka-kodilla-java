package food2door;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Glutten Free SHop - nie możemy zrealizować tego zamówienia");
        return false;
    }
}
