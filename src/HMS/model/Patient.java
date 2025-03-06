package CoreJavaPractices.src.HMS.model;

import java.util.UUID;

public record Patient(UUID id, String name, int age, String email, String mobileNumber) {}
