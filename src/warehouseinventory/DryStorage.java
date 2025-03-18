package CoreJavaPractices.src.warehouseinventory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class DryStorage implements StorageStrategy {
  private Deque<Product> dryStorageStack = new ArrayDeque<>();

  @Override
  public void addProduct(Product product) {
    dryStorageStack.push(product);
  }

  @Override
  public Optional<Product> retrieveProduct(String sku) {
    return dryStorageStack.stream().filter(product -> product.sku().equals(sku)).findFirst();
  }
}
