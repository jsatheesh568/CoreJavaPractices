package CoreJavaPractices.src.resumescreening;

import java.util.List;

public record JobRequirement(String jobTitle, List <String> requiredSkills, int minExperience, String requiredEducation) { }
