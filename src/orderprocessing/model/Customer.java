package CoreJavaPractices.orderprocessing.model;

import java.util.UUID;

public class Customer {
    private final UUID id;
    private final String name;
    private final String email;

    public Customer(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}