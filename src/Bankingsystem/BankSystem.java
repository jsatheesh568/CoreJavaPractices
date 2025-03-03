package CoreJavaPractices.src.Bankingsystem;

import java.util.List;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1000);
        BankAccount account2 = new BankAccount("Bob", 500);

        List <Transaction> transactions = List.of(
                new Deposit(account1, 200),
                new Withdrawal(account1, 300),
                new Transfer(account1, account2, 400),
                new Withdrawal(account1, 1500) // This will trigger InsufficientFundsException
        );

        transactions.forEach(Transaction::execute);

        // Print final balances
        System.out.println("\nFinal Balances:");
        System.out.println(account1.getAccountHolder() + ": $" + account1.getBalance());
        System.out.println(account2.getAccountHolder() + ": $" + account2.getBalance());

        // Print transaction history
        account1.printTransactionHistory();
        account2.printTransactionHistory();
    }
}
