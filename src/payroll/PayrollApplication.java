package CoreJavaPractices.src.payroll;

import CoreJavaPractices.src.payroll.exception.PayrollException;
import CoreJavaPractices.src.payroll.exception.SystemFailureException;
import CoreJavaPractices.src.payroll.model.Employee;
import CoreJavaPractices.src.payroll.model.FullTimeEmployee;
import CoreJavaPractices.src.payroll.model.PartTimeEmployee;
import CoreJavaPractices.src.payroll.service.PayrollService;

public class PayrollApplication {
  public static void main(String[] args) {
    PayrollService payrollService = new PayrollService();

    // 📌 Step 1: Add Employees
    addEmployees(payrollService);

    // 📌 Step 2: Register Departments
    registerDepartments(payrollService);

    // 📌 Step 3: Calculate Bonus
    calculateEmployeeBonus(payrollService);

    // 📌 Step 4: Filter Employees
    filterFullTimeEmployees(payrollService);

    // 📌 Step 5: Print All Employees
    printAllEmployees(payrollService);
  }

  // 📌 Add Employees
  private static void addEmployees(PayrollService payrollService) {
    try {
      Employee emp1 = new FullTimeEmployee("Alice", 5000);
      Employee emp2 = new PartTimeEmployee("Bob", 2000);
      Employee emp3 = new FullTimeEmployee("Charlie", 7000);

      payrollService.addEmployee(emp1);
      payrollService.addEmployee(emp2);
      payrollService.addEmployee(emp3);
    } catch (Exception e) {
      throw new SystemFailureException("Error adding employees: " + e.getMessage());
    }
  }

  // 📌 Register Departments
  private static void registerDepartments(PayrollService payrollService) {
    try {
      payrollService.registerDepartment("HR");
      payrollService.registerDepartment("IT");
    } catch (Exception e) {
      throw new SystemFailureException("Error registering departments: " + e.getMessage());
    }
  }
  // 📌 Calculate Employee Bonus
  private static void calculateEmployeeBonus(PayrollService payrollService) {
    try {
      // ✅ Unwrapping the Optional using orElseThrow
      Employee emp =
          payrollService
              .getEmployeeById("1")
              .orElseThrow(() -> new PayrollException("Employee not found with ID: 1"));

      double bonus = payrollService.calculateBonus(emp.getId(), 10);
      System.out.println("Bonus for " + emp.getName() + ": $" + bonus);
    } catch (PayrollException e) {
      System.out.println("Payroll operation failed: " + e.getMessage());
    } catch (Exception e) {
      throw new SystemFailureException("Unexpected system error: " + e.getMessage());
    }
  }

  // 📌 Filter and Display Full-Time Employees
  private static void filterFullTimeEmployees(PayrollService payrollService) {
    try {
      System.out.println("\nFull-Time Employees:");
      payrollService
          .filterEmployees(e -> e instanceof FullTimeEmployee)
          .forEach(System.out::println);
    } catch (Exception e) {
      throw new SystemFailureException("Error filtering employees: " + e.getMessage());
    }
  }

  // 📌 Print All Employees
  private static void printAllEmployees(PayrollService payrollService) {
    try {
      System.out.println("\nAll Employees:");
      payrollService.printAllEmployees();
    } catch (Exception e) {
      throw new SystemFailureException("Error printing employees: " + e.getMessage());
    }
  }
}
