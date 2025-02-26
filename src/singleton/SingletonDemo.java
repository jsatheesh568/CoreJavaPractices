package CoreJavaPractices.src.singleton;

import java.util.Scanner;

public class SingletonDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Choose Singleton Type (EAGER / LAZY): ");
    String input = scanner.next().toUpperCase();

    Singleton singleton;
    try {
      SingletonFactory.SingletonType type = SingletonFactory.SingletonType.valueOf(input);
      singleton = SingletonFactory.getSingleton(type);
      singleton.showMessage();
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid input! Choose 'EAGER' or 'LAZY'.");
    }

    scanner.close();
  }
}
