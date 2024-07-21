package src.SOLIDPrinciples.SingleResponsibility;

// Definition: A class should have only one reason to change, meaning it should only have one job or responsibility.
/*
    * Ensure that each class has only one responsibility.
    * Avoid mixing unrelated functionalities in a single class.
 */
public class SingleResponsibilityMain {
    public static void main(String[] args){
        User user = new User("Satheesh kumar", "satheeshkumar@gmail.com");
        UserPersistence userPersistence = new UserPersistence();
        userPersistence.saveUser(user);
        System.out.println(userPersistence.getUsers());
    }
}
