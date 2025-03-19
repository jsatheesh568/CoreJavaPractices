package CoreJavaPractices.src.resumescreening;

public class ExperienceBasedScreening implements ResumeScreeningStrategy {
  @Override
  public boolean matchesCriteria(Resume resume, JobRequirement jobRequirement) {
    return resume.experienceYears() >= jobRequirement.minExperience();
  }
}
