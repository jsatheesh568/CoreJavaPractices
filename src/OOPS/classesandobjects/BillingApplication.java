package CoreJavaPractices.src.OOPS.classesandobjects;

import java.io.IOException;
import java.util.*;

class Register {
  private static Register register = null;
  private final Map<String, Double> priceList;

  private Register() {
    priceList = new HashMap<>();
    priceList.put("apple", 2.0);
    priceList.put("orange", 1.5);
    priceList.put("mango", 1.2);
    priceList.put("grape", 1.0);
  }

  public static Register getInstance() {
    if (register == null) {
      register = new Register();
    }
    return register;
  }

  public String getTotalBill(Map<String, Integer> itemDetails) {
    double totalBill = 0.0;

    for (Map.Entry<String, Integer> entry : itemDetails.entrySet()) {
      String item = entry.getKey();
      int quantity = entry.getValue();

      if (priceList.containsKey(item)) {
        totalBill += priceList.get(item) * quantity;
      } else {
        System.out.println("Warning: " + item + " is not available.");
      }
    }
    return String.format("Total Bill: %.2f", totalBill);
    /*
    Enter items and their quantities (Press Enter to finish):
apple 2
orange 3
mango 1
grape 1
mango 3
apple 10
orange 1

Total Bill: 35.80
     */
  }
}

public class BillingApplication {
  public static void main(String[] args) throws IOException {
    Scanner readInput = new Scanner(System.in);
    Map<String, Integer> itemDetails = new HashMap<>();

    System.out.println("Enter items and their quantities (Press Enter to finish):");

    while (true) {
      String line = readInput.nextLine().trim();

      // Stop if the user presses Enter without any input
      if (line.isEmpty()) {
        break;
      }

      Scanner lineScanner = new Scanner(line);
      while (lineScanner.hasNext()) {
        String item = lineScanner.next().toLowerCase();

        if (!item.matches("[a-zA-Z]+")) {
          System.out.println("Warning: Skipping invalid input -> " + item);
          continue;
        }

        if (lineScanner.hasNextInt()) {
          int quantity = lineScanner.nextInt();
          itemDetails.merge(item, quantity, Integer::sum);
        } else {
          String invalidQuantity = lineScanner.next();
          System.out.println("Warning: Skipping invalid input -> " + invalidQuantity);
        }
      }
      lineScanner.close();
    }

    Register register = Register.getInstance();
    System.out.println(register.getTotalBill(itemDetails));

    readInput.close();
  }
}
