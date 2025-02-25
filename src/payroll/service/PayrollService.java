package CoreJavaPractices.src.payroll.service;

import CoreJavaPractices.src.payroll.exception.PayrollException;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import CoreJavaPractices.src.payroll.model.Employee;
import java.util.stream.Collectors;

public class PayrollService {
  private final Map<String, Employee> employeeMap = new ConcurrentHashMap<>();
  private final Set<String> departments = new HashSet<>();

  // 📌 Add Employee
  public void addEmployee(Employee employee) {
    employeeMap.put(employee.getId(), employee);
    System.out.println("Employee added: " + employee);
  }

  // 📌 Register Department
  public void registerDepartment(String department) {
    if (departments.add(department)) {
      System.out.println("Department registered: " + department);
    } else {
      System.out.println("Warning: Department " + department + " already exists");
    }
  }

  // 📌 Calculate Bonus using Functional Interface
  public double calculateBonus(String employeeId, double percentage) throws PayrollException {
    Employee emp = employeeMap.get(employeeId);
    if (emp == null) {
      throw new PayrollException("Employee not found: " + employeeId);
    }
    double bonus = emp.getSalary() * (percentage / 100);
    System.out.println("Bonus for " + emp.getName() + ": $" + bonus);
    return bonus;
  }

  // 📌 Get Employees based on Condition (Streams & Functional Programming)
  public List<Employee> filterEmployees(Predicate<Employee> condition) {
    return employeeMap.values().stream().filter(condition).collect(Collectors.toList());
  }

  // 📌 Print All Employees
  public void printAllEmployees() {
    employeeMap.values().forEach(System.out::println);
  }
}
