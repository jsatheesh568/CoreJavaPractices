package CoreJavaPractices.orderprocessing;

import CoreJavaPractices.orderprocessing.exception.OutOfStockException;
import CoreJavaPractices.orderprocessing.model.Customer;
import CoreJavaPractices.orderprocessing.payment.CreditCardPayment;
import CoreJavaPractices.orderprocessing.product.Order;
import CoreJavaPractices.orderprocessing.product.Product;
import CoreJavaPractices.orderprocessing.service.InventoryService;
import CoreJavaPractices.orderprocessing.service.NotificationService;
import CoreJavaPractices.orderprocessing.service.OrderService;
import java.util.List;
import java.util.UUID;

public class ECommerceApp {
  public static void main(String[] args) throws OutOfStockException {
    Customer customer = new Customer("Alice", "alice@example.com");

    Product laptop = new Product(UUID.randomUUID(), "Laptop", 1200.0, 5);
    Product phone = new Product(UUID.randomUUID(), "Smartphone", 800.0, 0);

    Order order = new Order(UUID.randomUUID(), customer, List.of(laptop, phone), 10);
    OrderService orderService = new OrderService(new InventoryService(), new NotificationService());
    orderService.processOrder(order, new CreditCardPayment("1234-5678-9876-5432"));
  }
}
