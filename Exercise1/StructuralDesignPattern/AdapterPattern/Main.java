import src.*;
public class Main {
    public static void main(String[] args) {
        LegacyPaymentProcessor legacyProcessor = new LegacyPaymentProcessor();
        PaymentGateway paymentGateway = new PaymentAdapter(legacyProcessor);

        paymentGateway.makePayment("USD", 100);
        paymentGateway.makePayment("EUR", 100);
        paymentGateway.makePayment("JPY", 1000);
 paymentGateway.makePayment("INR", 5000);
 
    }
}


