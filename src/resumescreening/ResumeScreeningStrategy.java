package CoreJavaPractices.src.resumescreening;

public interface ResumeScreeningStrategy {
    boolean matchesCriteria(Resume resume, JobRequirement jobRequirement);
}
