package Project; // Use your package name

public class Users {
    public String firstName;
    public String lastName;
    public String email;
    public String password;
    public String phone;
    public int userStatus;
    public String username;
    public int id; // Add ID to the class

    // Constructor
    public Users(String firstName, String lastName, String email, String password, String phone, int userStatus, String username, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
        this.username = username;
        this.id = id; // Set the ID
    }


}
