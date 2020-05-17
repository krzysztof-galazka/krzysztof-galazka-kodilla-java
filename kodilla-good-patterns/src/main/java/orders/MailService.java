package orders;

public class MailService implements InformationService {

    @Override
    public boolean sendConfirmation(OrderRequest orderRequest) {
        System.out.println("EMAIL CONFIRMATION \n  Product: " + orderRequest.getProduct().getName() + ", order from: " + orderRequest.getUser().getEmail());
        return true;
    }
}
