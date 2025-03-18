package CoreJavaPractices.src.warehouseinventory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class WarehouseManager {
  private final Map<StorageType, StorageStrategy> storageMap = new HashMap<>();

  public WarehouseManager() {
    storageMap.put(StorageType.COLD, new ColdStorage());
    storageMap.put(StorageType.DRY, new DryStorage());
  }

  public void storeProduct(Product product) {
    storageMap.get(product.storageType()).addProduct(product);
    System.out.println("✅ Product stored: " + product);
  }

  public void retrieveProduct(String sku, StorageType type) {
    Optional<Product> product = storageMap.get(type).retrieveProduct(sku);
    product.ifPresentOrElse(
        p -> System.out.println("✅ Product retrieved: " + p),
        () -> System.out.println("❌ Product not found."));
  }
}
