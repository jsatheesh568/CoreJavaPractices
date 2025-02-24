package CoreJavaPractices.src.userRegistration;

import CoreJavaPractices.src.userRegistration.exception.InvalidUserInputException;

@FunctionalInterface
public interface Validator {
    void validate(String input) throws InvalidUserInputException;
}
