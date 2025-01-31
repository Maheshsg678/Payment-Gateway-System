import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Payment Gateway System!");

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter currency (e.g., USD): ");
        String currency = scanner.nextLine();
        System.out.print("Enter payment method (e.g., card): ");
        String paymentMethod = scanner.nextLine();

        String transactionId = PaymentGateway.processPayment(amount, currency, paymentMethod);
        if (transactionId != null) {
            System.out.println("Payment successful! Transaction ID: " + transactionId);
        } else {
            System.out.println("Payment failed!");
        }

        scanner.close();
    }
}


