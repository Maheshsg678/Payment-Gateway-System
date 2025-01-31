
import java.util.UUID;

public class PaymentGateway {
    public static String processPayment(double amount, String currency, String paymentMethod) {
        // Simulate payment processing
        String transactionId = UUID.randomUUID().toString();
        String status = "success";  // In a real system, this would depend on the payment processor response
        TransactionLogger.logTransaction(transactionId, amount, currency, paymentMethod, status);
        return transactionId;
    }
}
