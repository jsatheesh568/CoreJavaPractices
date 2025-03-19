package CoreJavaPractices.src.resumescreening;

import java.util.List;
import java.util.stream.Collectors;

public class ResumeScreeningManager {
  private final List<ResumeScreeningStrategy> screeningStrategies;

  public ResumeScreeningManager(List<ResumeScreeningStrategy> screeningStrategies) {
    this.screeningStrategies = screeningStrategies;
  }

  public List<Resume> filterResumes(List<Resume> resumes, JobRequirement jobRequirement) {
    return resumes.stream()
        .filter(
            resume ->
                screeningStrategies.stream()
                    .allMatch(strategy -> strategy.matchesCriteria(resume, jobRequirement)))
        .collect(Collectors.toList());
  }
}
