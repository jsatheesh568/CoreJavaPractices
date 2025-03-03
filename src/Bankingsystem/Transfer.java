package CoreJavaPractices.src.Bankingsystem;

public record Transfer(BankAccount from, BankAccount to, double amount) implements Transaction {
    @Override
    public void execute() {
        try {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("✅ Transferred $" + amount + " from " + from.getAccountHolder() + " to " + to.getAccountHolder());
        } catch (InsufficientFundsException e) {
            System.err.println("❌ Transfer failed: " + e.getMessage());
        }
    }
}
