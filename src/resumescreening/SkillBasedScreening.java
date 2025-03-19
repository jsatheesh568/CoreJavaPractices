package CoreJavaPractices.src.resumescreening;

import java.util.Set;
import java.util.stream.Collectors;

public class SkillBasedScreening implements ResumeScreeningStrategy {
  private static final double MATCH_THRESHOLD = 0.7; // 70% match required

  @Override
  public boolean matchesCriteria(Resume resume, JobRequirement jobRequirement) {
    Set<String> candidateSkills =
        resume.skills().stream().map(String::toLowerCase).collect(Collectors.toSet());
    Set<String> requiredSkills =
        jobRequirement.requiredSkills().stream()
            .map(String::toLowerCase)
            .collect(Collectors.toSet());

    long matchingSkills = candidateSkills.stream().filter(requiredSkills::contains).count();
    double matchPercentage = (double) matchingSkills / requiredSkills.size();

    return matchPercentage >= MATCH_THRESHOLD;
  }
}
