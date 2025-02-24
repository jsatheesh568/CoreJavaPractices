package CoreJavaPractices.src.userRegistration.exception;

public class SystemFailureException extends RuntimeException {
    public SystemFailureException(String message) {
        super(message);
    }
}