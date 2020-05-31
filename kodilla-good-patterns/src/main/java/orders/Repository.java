package orders;

public interface Repository {
    boolean add(OrderRequest orderRequest);

    void show();
}