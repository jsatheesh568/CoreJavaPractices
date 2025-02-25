package CoreJavaPractices.src.payroll;

import CoreJavaPractices.src.payroll.exception.PayrollException;
import CoreJavaPractices.src.payroll.exception.SystemFailureException;
import CoreJavaPractices.src.payroll.model.Employee;
import CoreJavaPractices.src.payroll.model.FullTimeEmployee;
import CoreJavaPractices.src.payroll.model.PartTimeEmployee;
import CoreJavaPractices.src.payroll.service.PayrollService;

public class PayrollApplication {

  public static void main(String[] args) {
    try {
      PayrollService payrollService = new PayrollService();

      // 📌 Adding Employees
      Employee emp1 = new FullTimeEmployee("Alice", 5000);
      Employee emp2 = new PartTimeEmployee("Bob", 2000);
      Employee emp3 = new FullTimeEmployee("Charlie", 7000);

      payrollService.addEmployee(emp1);
      payrollService.addEmployee(emp2);
      payrollService.addEmployee(emp3);

      // 📌 Registering Departments
      payrollService.registerDepartment("HR");
      payrollService.registerDepartment("IT");

      // 📌 Calculating Bonus (Handled Exception)
      double bonus = payrollService.calculateBonus(emp1.getId(), 10);
      System.out.println("Bonus for " + emp1.getName() + ": $" + bonus);

      // 📌 Filtering Employees (Streams)
      System.out.println("\nFull-Time Employees:");
      payrollService
          .filterEmployees(e -> e instanceof FullTimeEmployee)
          .forEach(System.out::println);

      // 📌 View All Employees
      System.out.println("\nAll Employees:");
      payrollService.printAllEmployees();
    } catch (PayrollException e) {
      System.out.println("Payroll operation failed: " + e.getMessage());
    } catch (Exception e) {
      throw new SystemFailureException("Unexpected system error: " + e.getMessage());
    }
  }
}
