package CoreJavaPractices.src.resumescreening;

import java.util.List;

public class ResumeScreeningApp {
  public static void main(String[] args) {
    JobRequirement jobRequirement =
        new JobRequirement(
            "Software Engineer",
            List.of("Java", "Spring Boot", "Microservices", "Docker"),
            3,
            "Bachelor's Degree");

    List<Resume> resumes =
        List.of(
            new Resume(
                "Alice",
                "alice@example.com",
                "1234567890",
                List.of("Java", "Spring Boot", "SQL"),
                4,
                "Bachelor's Degree"),
            new Resume(
                "Bob",
                "bob@example.com",
                "9876543210",
                List.of("Python", "Django"),
                2,
                "Bachelor's Degree"),
            new Resume(
                "Charlie",
                "charlie@example.com",
                "5678901234",
                List.of("Java", "Spring Boot", "Microservices", "Docker"),
                5,
                "Master's Degree"));

    ResumeScreeningManager screeningManager =
        new ResumeScreeningManager(
            List.of(new SkillBasedScreening(), new ExperienceBasedScreening()));

    List<Resume> shortlistedResumes = screeningManager.filterResumes(resumes, jobRequirement);

    shortlistedResumes.forEach(
        resume -> {
          CandidateNotifier emailNotifier = new CandidateNotifier(EmailNotification::sendEmail);
          CandidateNotifier smsNotifier = new CandidateNotifier(SMSNotification::sendSMS);

          emailNotifier.notifyCandidate(resume);
          smsNotifier.notifyCandidate(resume);
        });
  }
}
