package CoreJavaPractices.src.resumescreening;

import java.util.List;

public record Resume(String candidateName, String email, String phoneNumber, List <String> skills, int experienceYears, String education) { }
