package CoreJavaPractices.src;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface SalaryStorage {
  void store(List<Double> salaries, double newSalary);
}

public class FIWithEncapSalaryManager {
  private List<Double> salaryHistory = new ArrayList<>();

  public void addSalaryRecord(SalaryStorage storage, double salary) {
    storage.store(salaryHistory, salary);
  }

  public List<Double> getSalaryHistory() {
    return salaryHistory;
  }

  public static void main(String[] args) {
    FIWithEncapSalaryManager manager = new FIWithEncapSalaryManager();

    // Lambda to add salary record
    SalaryStorage addSalary = (list, salary) -> list.add(salary);

    manager.addSalaryRecord(addSalary, 50000);
    manager.addSalaryRecord(addSalary, 55000);

    System.out.println(manager.getSalaryHistory()); // Output: [50000.0, 55000.0]
  }
}
