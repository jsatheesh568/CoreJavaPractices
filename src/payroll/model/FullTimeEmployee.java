package CoreJavaPractices.src.payroll.model;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getEmployeeType() { return "Full-Time Employee"; }
}
