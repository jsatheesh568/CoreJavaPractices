package CoreJavaPractices.src.Bankingsystem;

public record Withdrawal(BankAccount account, double amount) implements Transaction {
    @Override
    public void execute() {
        try {
            account.withdraw(amount);
            System.out.println("✅ Withdrawn $" + amount);
        } catch (InsufficientFundsException e) {
            System.err.println("❌ " + e.getMessage());
        }
    }
}
