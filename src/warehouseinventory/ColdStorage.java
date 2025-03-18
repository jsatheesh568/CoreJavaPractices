package CoreJavaPractices.src.warehouseinventory;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class ColdStorage implements StorageStrategy {
  private Queue<Product> coldStorageQueue = new LinkedList<>();

  @Override
  public void addProduct(Product product) {
    coldStorageQueue.add(product);
  }

  @Override
  public Optional<Product> retrieveProduct(String sku) {
    return coldStorageQueue.stream().filter(product -> product.sku().equals(sku)).findFirst();
  }
}
