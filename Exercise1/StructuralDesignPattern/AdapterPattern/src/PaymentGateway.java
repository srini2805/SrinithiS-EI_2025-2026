package src;
public interface PaymentGateway {
    void makePayment(String currency, double amount);
}
