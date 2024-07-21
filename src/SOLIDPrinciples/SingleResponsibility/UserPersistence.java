package src.SOLIDPrinciples.SingleResponsibility;

public class UserPersistence {
    private java.util.List < User> users = new java.util.ArrayList <> ();

    public void saveUser(User user) {

        users.add(user);
    }

    public java.util.List < User> getUsers() {

        return users;
    }
}
