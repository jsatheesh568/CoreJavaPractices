package CoreJavaPractices.src.Collections.list;

public class User {
    private int userId;
    private String name;

    private String Address;

    public User ( int userId , String name , String address ) {
        this.userId = userId;
        this.name = name;
        Address = address;
    }

    public int getUserId ( ) {
        return userId;
    }

    public void setUserId ( int userId ) {
        this.userId = userId;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getAddress ( ) {
        return Address;
    }

    public void setAddress ( String address ) {
        Address = address;
    }

    @Override
    public String toString ( ) {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
