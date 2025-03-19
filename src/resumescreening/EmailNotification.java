package CoreJavaPractices.src.resumescreening;

public class EmailNotification {
  public static void sendEmail(Resume resume) {
    System.out.println(
        "📧 Email sent to " + resume.email() + ": Congratulations! You have been shortlisted.");
  }
}
