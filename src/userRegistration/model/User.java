package CoreJavaPractices.src.userRegistration.model;

public class User {
    private final String name;
    private final String email;
    private final String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "User{" + "Name='" + name + "', Email='" + email + "'}";
    }
}
