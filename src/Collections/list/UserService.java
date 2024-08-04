package CoreJavaPractices.src.Collections.list;

public class UserService {
    private java.util.List < User> users = new java.util.ArrayList <> ();
    private java.util.Map < Integer, User> userMap = new java.util.HashMap <> ();

    public void addUser(User user) {
        users.add(user);
        userMap.put(user.getUserId(), user);
    }

    public User getUserById(int userId) {
        return userMap.get(userId);
    }

    public java.util.List < User> getUsersByCity( String city) {
        java.util.List < User> result = new java.util.ArrayList <> ();
        for (User user : users) {
            if (user.getAddress().equalsIgnoreCase(city)) {
                result.add(user);
            }
        }
        return result;
    }

    public void updateUser(User updatedUser) {
        int userId = updatedUser.getUserId();
        if (userMap.containsKey(userId)) {
            userMap.put(userId, updatedUser);
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUserId() == userId) {
                    users.set(i, updatedUser);
                    break;
                }
            }
        }
    }

    public void printAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
