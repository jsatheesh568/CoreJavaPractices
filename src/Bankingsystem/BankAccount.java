package CoreJavaPractices.src.Bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountHolder;
    private double balance;
    private final List <Transaction> transactionHistory = new ArrayList <> ();

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Deposit(this, amount));
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: $" + balance);
        }
        balance -= amount;
        transactionHistory.add(new Withdrawal(this, amount));
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void printTransactionHistory() {
        System.out.println("📜 Transaction History for " + accountHolder + ":");
        transactionHistory.forEach(System.out::println);
    }
}
