package CoreJavaPractices.src.userRegistration;

import CoreJavaPractices.src.userRegistration.exception.InvalidUserInputException;
import CoreJavaPractices.src.userRegistration.exception.SystemFailureException;
import CoreJavaPractices.src.userRegistration.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
  private final List <User> users = new ArrayList<>();

  // Functional Validators
  private final Validator nameValidator =
      input -> {
        if (input == null || input.trim().isEmpty()) {
          throw new InvalidUserInputException("Name cannot be empty.");
        }
      };

  private final Validator emailValidator =
      input -> {
        if (input == null || !input.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
          throw new InvalidUserInputException("Invalid email format.");
        }
      };

  private final Validator passwordValidator =
      input -> {
        if (input == null || input.length() < 6) {
          throw new InvalidUserInputException("Password must be at least 6 characters long.");
        }
      };

  // Register User
  public void registerUser(String name, String email, String password) {
    try {
      nameValidator.validate(name);
      emailValidator.validate(email);
      passwordValidator.validate(password);

      User user = new User(name, email, password);
      users.add(user);
      System.out.println("User registered successfully: " + user);
    } catch (InvalidUserInputException e) {
      System.err.println("Registration Failed: " + e.getMessage());
    } catch (Exception e) {
      throw new SystemFailureException("Unexpected system error: " + e.getMessage());
    }
  }

  // Get Registered Users
  public List< User > getAllUsers() {
    return new ArrayList<>(users);
  }

  // Search Users using Streams (Case-Insensitive Search)
  public List<User> searchUsers(String searchQuery) {
    return users.stream()
        .filter(
            user ->
                user.getName().equalsIgnoreCase(searchQuery)
                    || user.getEmail().equalsIgnoreCase(searchQuery))
        .collect(Collectors.toList());
  }
}
