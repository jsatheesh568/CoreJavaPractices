package CoreJavaPractices.orderprocessing.service;

import CoreJavaPractices.orderprocessing.exception.OutOfStockException;
import CoreJavaPractices.orderprocessing.product.Product;
import java.util.List;

public class InventoryService {
  public void checkStock(List<Product> products) throws OutOfStockException {
    for (Product product : products) {
      if (product.stock() <= 0) {
        throw new OutOfStockException(
            "❌ Order Failed: Product " + product.name() + " is out of stock.");
      }
    }
  }
}
