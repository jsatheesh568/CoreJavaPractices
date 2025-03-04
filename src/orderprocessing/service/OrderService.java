package CoreJavaPractices.orderprocessing.service;

import CoreJavaPractices.orderprocessing.exception.OutOfStockException;
import CoreJavaPractices.orderprocessing.payment.CreditCardPayment;
import CoreJavaPractices.orderprocessing.product.Order;
import CoreJavaPractices.orderprocessing.product.Product;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
  private final InventoryService inventoryService;
  private final NotificationService notificationService;

  public OrderService(InventoryService inventoryService, NotificationService notificationService) {
    this.inventoryService = inventoryService;
    this.notificationService = notificationService;
  }

  public void processOrder(Order order, CreditCardPayment payment) throws OutOfStockException {
    // ✅ Remove out-of-stock products before processing the order
    List<Product> availableProducts =
        order.products().stream()
            .filter(product -> product.stock() > 0)
            .collect(Collectors.toList());

    if (availableProducts.isEmpty()) {
      System.out.println("❌ Order Failed: All products are out of stock.");
      return;
    }

    inventoryService.checkStock(availableProducts);

    double totalAmount = order.calculateTotal();
    payment.processPayment(totalAmount);

    List<Product> updatedProducts =
        availableProducts.stream()
            .map(
                product ->
                    new Product(product.id(), product.name(), product.price(), product.stock() - 1))
            .collect(Collectors.toList());

    System.out.println("✅ Order Successful: " + updatedProducts.size() + " products purchased.");
  }
}
