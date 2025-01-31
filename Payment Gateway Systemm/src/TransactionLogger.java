
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionLogger {
    public static void logTransaction(String transactionId, double amount, String currency, String paymentMethod, String status) {
        String sql = "INSERT INTO transactions (transaction_id, amount, currency, payment_method, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, transactionId);
            pstmt.setDouble(2, amount);
            pstmt.setString(3, currency);
            pstmt.setString(4, paymentMethod);
            pstmt.setString(5, status);
            pstmt.executeUpdate();
            System.out.println("Transaction logged successfully");
        } catch (SQLException e) {
            System.err.println("Error logging transaction: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
