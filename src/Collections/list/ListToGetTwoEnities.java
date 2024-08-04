package CoreJavaPractices.src.Collections.list;

public class ListToGetTwoEnities {
    public static void main(String[] args){
        UserService userService = new UserService();
        AccountService accountService = new AccountService();

        User user1 = new User(1, "John Doe", "New York");
        User user2 = new User(2, "Jane Smith", "Los Angeles");
        User user3 = new User(3, "Mike Johnson", "New York");

        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        Account account1 = new Account(1, "Account1", "New York");
        Account account2 = new Account(2, "Account2", "Los Angeles");
        Account account3 = new Account(3, "Account3", "New York");

        accountService.addAccount(account1);
        accountService.addAccount(account2);
        accountService.addAccount(account3);

        System.out.println("Users in New York:");
        for (User user : userService.getUsersByCity("New York")) {
            System.out.println(user);
        }

        System.out.println("\nAccounts in New York:");
        for (Account account : accountService.getAccountsByCity("New York")) {
            System.out.println(account);
        }

        System.out.println("\nAll Users:");
        userService.printAllUsers();

        System.out.println("\nAll Accounts:");
        accountService.printAllAccounts();
    }
    }


