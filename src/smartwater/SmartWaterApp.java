package CoreJavaPractices.src.smartwater;

import java.util.Arrays;
import java.util.List;

public class SmartWaterApp {
  public static void main(String[] args) {
    SmartWaterTank tank1 = new SmartWaterTank(100);
    SmartWaterTank tank2 = new SmartWaterTank(150);

    try {
      tank1.fill(50);
      tank2.fill(100);
      tank1.fill(60);
    } catch (TankOverflowException e) {
      System.out.println(e.getMessage());
    }

    List <SmartWaterTank> tanks = Arrays.asList(tank1, tank2);
    WaterDistributionSystem distributor = new WaterDistributionSystem();

    try {
      distributor.distributeWater(tanks, 30);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    BillingService creditCardBilling = new CreditCardBilling();
    BillingService bankTransferBilling = new BankTransferBilling();

    creditCardBilling.process(new Bill("Alice", 120.50));
    bankTransferBilling.process(new Bill("Bob", 250.75));
  }
}
