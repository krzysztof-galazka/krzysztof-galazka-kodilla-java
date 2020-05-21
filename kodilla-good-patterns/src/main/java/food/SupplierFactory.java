package food;

public class SupplierFactory {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";
    public static final String HEALTH_SHOP = "HealthShop";

    public static SupplierOrderService get(String supplier) throws Exception {
        switch (supplier){
            case EXTRA_FOOD_SHOP: return new ExtraFoodShop();
            case GLUTEN_FREE_SHOP: return new GlutenFreeShop();
            case HEALTH_SHOP: return new HealthyShop();

            default:throw new Exception("Supplier not supported");
        }
    }
}
