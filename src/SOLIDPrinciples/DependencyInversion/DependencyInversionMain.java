package src.SOLIDPrinciples.DependencyInversion;
// Definition: High-level modules should not depend on low-level modules.
// Both should depend on abstractions.
// Abstractions should not depend on details. Details should depend on abstractions.

/*
    * Use dependency injection to pass dependencies to a class.
    * Depend on abstractions rather than concrete implementations.
 */

public class DependencyInversionMain {
    public static void main(String[] args){
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendNotification("Hello via Email");

        MessageSender smsSender = new SmsSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendNotification("Hello via SMS");
    }
}
