package CoreJavaPractices.src.userRegistration;

import CoreJavaPractices.src.userRegistration.model.User;

import java.util.List;

public class UserRegistrationApp {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Register Users
        userService.registerUser("Alice", "alice@example.com", "pass123");
        userService.registerUser("Bob", "bob@domain.com", "securePwd");
        userService.registerUser("Charlie", "invalid-email", "short"); // Will fail validation

        // Get All Registered Users
        System.out.println("\nAll Registered Users: " + userService.getAllUsers());

        // Search User by Name (Case-Insensitive)
        System.out.println("\nSearching for 'alice'...");
        List < User > foundUsers = userService.searchUsers("alice");
        System.out.println("Search Results: " + foundUsers);
    }
}
