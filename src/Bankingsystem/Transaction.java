package CoreJavaPractices.src.Bankingsystem;

public sealed interface Transaction permits Deposit, Withdrawal, Transfer {
    void execute();
}
