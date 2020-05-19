package food;

import java.time.LocalDateTime;

public class SupplierInformationService implements InformationService {
    @Override
    public void inform(Supplier supplier, Product product) {
        System.out.println("Supplier " + supplier + ", quantity " + product.getQuantity() + " of " + product);
    }
}
