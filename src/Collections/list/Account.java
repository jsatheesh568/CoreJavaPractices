package CoreJavaPractices.src.Collections.list;

public class Account {
    private int accountId;

    private String accountName;

    private String city;

    public Account ( int accountId , String accountName , String city ) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.city = city;
    }

    public int getAccountId ( ) {
        return accountId;
    }

    public void setAccountId ( int accountId ) {
        this.accountId = accountId;
    }

    public String getAccountName ( ) {
        return accountName;
    }

    public void setAccountName ( String accountName ) {
        this.accountName = accountName;
    }

    public String getCity ( ) {
        return city;
    }

    public void setCity ( String city ) {
        this.city = city;
    }

    @Override
    public String toString ( ) {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
