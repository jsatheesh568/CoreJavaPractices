package CoreJavaPractices.src.SHAS;

import CoreJavaPractices.src.SHAS.exception.DeviceNotFoundException;
import CoreJavaPractices.src.SHAS.homedevices.SmartAC;
import CoreJavaPractices.src.SHAS.homedevices.SmartLight;
import CoreJavaPractices.src.SHAS.homedevices.SmartLock;
import CoreJavaPractices.src.SHAS.notification.EmailNotification;
import CoreJavaPractices.src.SHAS.notification.Notification;
import CoreJavaPractices.src.SHAS.notification.SMSNotification;
import CoreJavaPractices.src.SHAS.service.SmartHomeService;

public class SmartHomeApplication {
  public static void main(String[] args) {
    SmartHomeService homeService = new SmartHomeService();

    homeService.addDevice("Light", new SmartLight());
    homeService.addDevice("AC", new SmartAC());
    homeService.addDevice("Lock", new SmartLock());

    try {
      homeService.executeCommand("Light", "on");
      homeService.executeCommand("AC", "22");
      homeService.executeCommand("Lock", "unlock");

      homeService.showDeviceStatus();
    } catch (DeviceNotFoundException e) {
      System.out.println(e.getMessage());
    }

    EmailNotification email = new EmailNotification();
    SMSNotification sms = new SMSNotification();

    email.send(new Notification("alice@example.com", "Your smart home is configured!"));
    sms.send(new Notification ("9876543210", "Security Alert: Door Unlocked!"));
  }
}
