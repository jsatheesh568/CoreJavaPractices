package CoreJavaPractices.src.HMS.service;

import CoreJavaPractices.src.HMS.exception.DoctorNotAvailableException;
import CoreJavaPractices.src.HMS.exception.PatientNotFoundException;
import CoreJavaPractices.src.HMS.model.Doctor;
import CoreJavaPractices.src.HMS.model.Patient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class AppointmentService {
  private final List<Patient> patients;
  private final List<Doctor> doctors;

  public AppointmentService(List<Patient> patients, List<Doctor> doctors) {
    this.patients = patients;
    this.doctors = doctors;
  }

  public void scheduleAppointment(UUID patientId, String doctorSpecialization)
      throws PatientNotFoundException {
    Patient patient =
        patients.stream()
            .filter(p -> p.id().equals(patientId))
            .findFirst()
            .orElseThrow(() -> new PatientNotFoundException("❌ Patient Not Found!"));

    Optional<Doctor> doctorOpt =
        doctors.stream()
            .filter(d -> d.specialization().equalsIgnoreCase(doctorSpecialization))
            .findFirst();

    if (doctorOpt.isPresent()) {
      System.out.println(
          "✅ Appointment scheduled for " + patient.name() + " with " + doctorOpt.get().name());
    } else {
      throw new DoctorNotAvailableException(
          "❌ No doctor available for specialization: " + doctorSpecialization);
    }
  }
}
