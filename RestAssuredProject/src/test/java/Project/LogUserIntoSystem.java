package Project;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LogUserIntoSystem {

    public static void main(String[] args) {
        String username = "john_doe"; // Replace with the username
        String password = "password123"; // Replace with the password
        loginUser(username, password);
    }

    public static void loginUser(String username, String password) {
        try {
            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .get("/user/login?username=" + username + "&password=" + password);

            System.out.println("Login Response code for user " + username + ": " + response.getStatusCode());
            System.out.println("Login Response body: " + response.asString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
