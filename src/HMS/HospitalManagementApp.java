package CoreJavaPractices.src.HMS;

import CoreJavaPractices.src.HMS.exception.PatientNotFoundException;
import CoreJavaPractices.src.HMS.model.Doctor;
import CoreJavaPractices.src.HMS.model.Patient;
import CoreJavaPractices.src.HMS.notification.EmailNotification;
import CoreJavaPractices.src.HMS.notification.NotificationService;
import CoreJavaPractices.src.HMS.notification.SMSNotification;
import CoreJavaPractices.src.HMS.payment.CreditCardPayment;
import CoreJavaPractices.src.HMS.payment.InsurancePayment;
import CoreJavaPractices.src.HMS.service.AppointmentService;
import CoreJavaPractices.src.HMS.service.BillingService;

import java.util.List;
import java.util.UUID;

public class HospitalManagementApp {
  public static void main(String[] args) {
    Patient patient1 = new Patient(UUID.randomUUID(), "Alice", 30, "alice@example.com","+65 348976522");
    Patient patient2 = new Patient(UUID.randomUUID(), "Bob", 45, "bob@example.com","+81 82349342034");

    List<Patient> patients = List.of(patient1, patient2);
    List<Doctor> doctors =
        List.of(
            new Doctor(UUID.randomUUID(), "Dr. Smith", "Cardiology"),
            new Doctor(UUID.randomUUID(), "Dr. Lee", "Neurology"));

    AppointmentService appointmentService = new AppointmentService(patients, doctors);
    NotificationService emailNotification = new EmailNotification ();
    NotificationService smsNotification = new SMSNotification();

    BillingService creditCardPayment = new CreditCardPayment ("1234-5678-9012-3456");
    BillingService insurancePayment = new InsurancePayment();

    try {
      appointmentService.scheduleAppointment(patient1.id(), "Cardiology");
      creditCardPayment.processBill(200.0);
      emailNotification.sendNotification(patient1, "Your appointment is confirmed.");

      appointmentService.scheduleAppointment(patient2.id(), "Neurology");
      insurancePayment.processBill(500.0);
      smsNotification.sendNotification(patient2, "Your appointment is confirmed.");
    } catch (PatientNotFoundException e) {
      System.out.println("❌ " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("⚠️ Error: " + e.getMessage());
    }
  }
}
