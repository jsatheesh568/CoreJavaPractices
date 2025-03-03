package CoreJavaPractices.src.Bankingsystem;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
