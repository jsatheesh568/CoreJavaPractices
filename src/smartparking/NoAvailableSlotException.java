package CoreJavaPractices.src.smartparking;

public class NoAvailableSlotException extends RuntimeException {
  public NoAvailableSlotException(String message) {
    super(message);
  }
}
