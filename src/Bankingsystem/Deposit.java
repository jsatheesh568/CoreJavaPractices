package CoreJavaPractices.src.Bankingsystem;

public record Deposit(BankAccount account, double amount) implements Transaction {
    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("✅ Deposited $" + amount);
    }
}
