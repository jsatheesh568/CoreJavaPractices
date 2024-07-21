package src.SOLIDPrinciples.OpenClosed;

// Definition: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
/*
    * Use inheritance or composition to extend the behavior of classes.
    * Avoid modifying existing code to add new functionality.
 */
public class OpenClosedMain {
    public static void main(String[] args){
        Employee fullTimeEmployee = new FullTimeEmployee("Alice", 5000);
        Employee partTimeEmployee = new PartTimeEmployee("Bob", 20, 80);

        System.out.println("Full-time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}
