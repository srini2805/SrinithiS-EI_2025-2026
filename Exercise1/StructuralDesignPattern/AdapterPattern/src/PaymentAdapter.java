package src;
public class PaymentAdapter implements PaymentGateway {
    private LegacyPaymentProcessor legacyProcessor;

    public PaymentAdapter(LegacyPaymentProcessor legacyProcessor) {
        this.legacyProcessor = legacyProcessor;
    }

    @Override
    public void makePayment(String currency, double amount) {
        double amountInUSD = convertToUSD(currency, amount);
        legacyProcessor.payInUSD(amountInUSD);
    }

    private double convertToUSD(String currency, double amount) {
        switch (currency.toUpperCase()) {
            case "EUR": return amount * 1.1; // Example exchange rate
            case "GBP": return amount * 1.3;
            case "JPY": return amount * 0.007;
            case "INR": return amount*0.012;
            default: return amount; // Default is USD
        }
    }
}