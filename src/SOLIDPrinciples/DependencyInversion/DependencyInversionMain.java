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
        src.SOLIDPrinciples.DependencyInversion.MessageSender emailSender = new src.SOLIDPrinciples.DependencyInversion.EmailSender ();
        src.SOLIDPrinciples.DependencyInversion.NotificationService emailNotificationService = new src.SOLIDPrinciples.DependencyInversion.NotificationService (emailSender);
        emailNotificationService.sendNotification("Hello via Email");

        src.SOLIDPrinciples.DependencyInversion.MessageSender smsSender = new src.SOLIDPrinciples.DependencyInversion.SmsSender ();
        src.SOLIDPrinciples.DependencyInversion.NotificationService smsNotificationService = new src.SOLIDPrinciples.DependencyInversion.NotificationService (smsSender);
        smsNotificationService.sendNotification("Hello via SMS");
    }
}
