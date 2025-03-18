package CoreJavaPractices.src.warehouseinventory;

public class WarehouseInventoryApp {
  public static void main(String[] args) {
    WarehouseManager warehouseManager = new WarehouseManager();

    Product milk = new Product("SKU123", "Milk", 10, StorageType.COLD);
    Product rice = new Product("SKU456", "Rice", 20, StorageType.DRY);

    warehouseManager.storeProduct(milk);
    warehouseManager.storeProduct(rice);

    warehouseManager.retrieveProduct("SKU123", StorageType.COLD);
    warehouseManager.retrieveProduct("SKU456", StorageType.DRY);

    SupplierIntegration supplier =
        new SupplierIntegration(
            product -> System.out.println("📦 Stock ordered for: " + product.name()));

    supplier.orderStock(new Product("SKU789", "Chicken", 15, StorageType.COLD));
  }
}
