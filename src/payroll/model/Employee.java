package CoreJavaPractices.src.payroll.model;

import java.util.UUID;

public abstract class Employee {
    protected final String id;
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // 📌 Abstract Method (OOP - Abstraction)
    public abstract String getEmployeeType();

    @Override
    public String toString() {
        return getEmployeeType() + " { ID: " + id + ", Name: " + name + ", Salary: $" + salary + " }";
    }
}
