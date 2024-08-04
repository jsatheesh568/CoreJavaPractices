package CoreJavaPractices.src.Collections.list;

public class AccountService {
    private java.util.List < Account> accounts = new java.util.ArrayList <> ();
    private java.util.Map < Integer, Account> accountMap = new java.util.HashMap <> ();

    public void addAccount(Account account) {
        accounts.add(account);
        accountMap.put(account.getAccountId(), account);
    }

    public Account getAccountById(int accountId) {
        return accountMap.get(accountId);
    }

    public java.util.List < Account> getAccountsByCity( String city) {
        java.util.List < Account> result = new java.util.ArrayList <> ();
        for (Account account : accounts) {
            if (account.getCity().equalsIgnoreCase(city)) {
                result.add(account);
            }
        }
        return result;
    }

    public void updateAccount(Account updatedAccount) {
        int accountId = updatedAccount.getAccountId();
        if (accountMap.containsKey(accountId)) {
            accountMap.put(accountId, updatedAccount);
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(i).getAccountId() == accountId) {
                    accounts.set(i, updatedAccount);
                    break;
                }
            }
        }
    }

    public void printAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
