package CoreJavaPractices.src.warehouseinventory;

import java.util.function.Consumer;

public class SupplierIntegration {
  private final Consumer<Product> replenishAction;

  public SupplierIntegration(Consumer<Product> replenishAction) {
    this.replenishAction = replenishAction;
  }

  public void orderStock(Product product) {
    System.out.println("🔄 Replenishing stock for " + product.name());
    replenishAction.accept(product);
  }
}
