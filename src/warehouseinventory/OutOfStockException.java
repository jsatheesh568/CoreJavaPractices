package CoreJavaPractices.src.warehouseinventory;

public class OutOfStockException extends RuntimeException {
  public OutOfStockException(String message) {
    super(message);
  }
}
