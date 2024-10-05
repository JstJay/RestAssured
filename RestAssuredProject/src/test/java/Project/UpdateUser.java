package Project;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class UpdateUser {

    public static void main(String[] args) {
        String username = "john_doe"; // Replace with the username to update
        Users updatedUser = new Users("Jonathan", "Doe", "john@example.com", "password123", "1234567890", 1, "john_doe", 1);
        
        updateUser(username, updatedUser);
    }

    public static void updateUser(String username, Users updatedUser) {
        try {
            JSONObject userObject = new JSONObject();
            userObject.put("id", 1); // ID should match the user to update
            userObject.put("firstName", updatedUser.firstName);
            userObject.put("lastName", updatedUser.lastName);
            userObject.put("email", updatedUser.email);
            userObject.put("password", updatedUser.password);
            userObject.put("phone", updatedUser.phone);
            userObject.put("userStatus", updatedUser.userStatus);
            userObject.put("username", updatedUser.username);

            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(userObject.toString())
                    .put("/user/" + username);

            System.out.println("Update User Response code: " + response.getStatusCode());
            System.out.println("Update User Response body: " + response.asString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
