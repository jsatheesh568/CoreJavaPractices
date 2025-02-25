package CoreJavaPractices.src;

@FunctionalInterface
interface SalaryUpdater {
    double update(double currentSalary, double increment);
}

class Employees {
    private String name;
    private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary must be positive");
        }
    }

    public void applySalaryUpdate(SalaryUpdater updater, double increment) {
        double newSalary = updater.update(this.salary, increment);
        setSalary(newSalary); // Internal call, still private
    }

    @Override
    public String toString() {
        return name + " earns " + salary;
    }
}

public class FunctionalEncapsulationDemo {
    public static void main(String[] args) {
        Employees emp = new Employees("Alice", 50000);

        // Lambda controlling salary modification
        SalaryUpdater salaryUpdater = (currentSalary, increment) -> currentSalary + increment;

        emp.applySalaryUpdate(salaryUpdater, 5000);

        System.out.println(emp);
    }
}

