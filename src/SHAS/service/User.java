package CoreJavaPractices.src.SHAS.service;

import java.util.UUID;

public record User(UUID id, String name, String email, String mobile) {}
