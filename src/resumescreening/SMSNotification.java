package CoreJavaPractices.src.resumescreening;

public class SMSNotification {
  public static void sendSMS(Resume resume) {
    System.out.println(
        "📱 SMS sent to " + resume.phoneNumber() + ": Congratulations! You have been shortlisted.");
  }
}
