package CoreJavaPractices.src.Java8.Employees;

import java.util.*;
import java.util.stream.*;

class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }
}

public class FilterEmployees {
  public static void main(String[] args) {
    List<Employee> employees =
        Arrays.asList(new Employee("John", 25000), new Employee("Jane", 18000));

    List<String> highSalaryEmployees =
        employees.stream()
            .filter(e -> e.getSalary() > 20000)
            .map(Employee::getName)
            .collect(Collectors.toList());
    System.out.println(highSalaryEmployees);
  }
}
