package CoreJavaPractices.src.payroll.service;

import CoreJavaPractices.src.payroll.exception.PayrollException;
import CoreJavaPractices.src.payroll.model.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PayrollService {
  private final Map<String, Employee> employeeMap = new ConcurrentHashMap<>();
  private final Set<String> departments = new HashSet<>();

  // 📌 Add Employee
  public void addEmployee(Employee employee) {
    if (employee == null) {
      logWarning("Cannot add a null employee.");
      return;
    }
    employeeMap.put(employee.getId(), employee);
    logInfo("Employee added: " + employee);
  }

  // 📌 Register Department
  public void registerDepartment(String department) {
    if (department == null || department.isBlank()) {
      logWarning("Invalid department name.");
      return;
    }
    if (departments.add(department)) {
      logInfo("Department registered: " + department);
    } else {
      logWarning("Department " + department + " already exists.");
    }
  }

  // 📌 Get Employee By ID (Utility Method)
  public Optional<Employee> getEmployeeById(String employeeId) {
    return Optional.ofNullable(employeeMap.get(employeeId));
  }

  // 📌 Calculate Bonus using Functional Interface
  public double calculateBonus(String employeeId, double percentage) throws PayrollException {
    Employee emp =
        getEmployeeById(employeeId)
            .orElseThrow(() -> new PayrollException("Employee not found: " + employeeId));

    double bonus = emp.getSalary() * (percentage / 100);
    logInfo("Bonus for " + emp.getName() + ": $" + bonus);
    return bonus;
  }

  // 📌 Get Employees based on Condition (Streams & Functional Programming)
  public List<Employee> filterEmployees(Predicate<Employee> condition) {
    return employeeMap.values().stream().filter(condition).collect(Collectors.toList());
  }

  // 📌 Print All Employees
  public void printAllEmployees() {
    if (employeeMap.isEmpty()) {
      logWarning("No employees found.");
      return;
    }
    logInfo("Employee List:");
    employeeMap.values().forEach(System.out::println);
  }

  // 📌 Utility Methods for Logging
  private void logInfo(String message) {
    System.out.println("[INFO] " + message);
  }

  private void logWarning(String message) {
    System.out.println("[WARNING] " + message);
  }
}
