package food;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Supplier {
    private final String companyName;
    private final SupplierOrderService supplierOrderService;
    private final List<Product> companyProducts;

    public Supplier(final String companyName, final SupplierOrderService supplierOrderService) {
        this.companyName = companyName;
        this.supplierOrderService = supplierOrderService;
        this.companyProducts = createCompanyProductList();
    }

    public SupplierOrderService getSupplierOrderService() {
        return supplierOrderService;
    }

    public List<Product> getCompanyProducts() {
        return companyProducts;
    }

    private List<Product> createCompanyProductList() {
        final List<Product> products = new ArrayList<>();
        products.add(new Product("Watter", new Random().nextInt(20)));
        products.add(new Product("Bread", new Random().nextInt(20)));

        return products;
    }

    @Override
    public String toString() {
        return companyName;
    }
}