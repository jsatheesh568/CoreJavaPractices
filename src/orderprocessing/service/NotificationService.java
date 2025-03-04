package CoreJavaPractices.orderprocessing.service;

import CoreJavaPractices.orderprocessing.NotificationSender;
import CoreJavaPractices.orderprocessing.model.Customer;

public class NotificationService {
  public void sendNotification(Customer customer, String message) {
    NotificationSender sender =
        msg -> System.out.println("📧 Email to " + customer.getEmail() + ": " + msg);
    sender.send(message);
  }
}
