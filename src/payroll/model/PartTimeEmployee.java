package CoreJavaPractices.src.payroll.model;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getEmployeeType() { return "Part-Time Employee"; }
}
