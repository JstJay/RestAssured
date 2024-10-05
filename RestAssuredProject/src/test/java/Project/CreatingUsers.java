package Project;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreatingUsers {

    public static void main(String[] args) {

        // Sample input array with user data including ID
        String[][] usersData = {
            {"1", "John", "Doe", "john@example.com", "password123", "1234567890", "1", "john_doe"},
            {"2", "Jane", "Smith", "jane@example.com", "password456", "0987654321", "1", "jane_smith"},
            {"3", "Mike", "Johnson", "mike@example.com", "password789", "5555555555", "1", "mike_johnson"}
        };

        // Base URL of the API
        RestAssured.baseURI = "https://petstore.swagger.io/v2"
        		+ "";

        // Create a JSON array to hold all user objects
        JSONArray userArray = new JSONArray();

        // Iterate over the user data array and create user objects
        for (String[] userData : usersData) {
            try {
                // Create a JSONObject for each user
                JSONObject userObject = new JSONObject();
                userObject.put("id", Integer.parseInt(userData[0])); // Add ID
                userObject.put("firstName", userData[1]);            // Add firstName
                userObject.put("lastName", userData[2]);             // Add lastName
                userObject.put("email", userData[3]);                // Add email
                userObject.put("password", userData[4]);             // Add password
                userObject.put("phone", userData[5]);                // Add phone
                userObject.put("userStatus", Integer.parseInt(userData[6])); // Add userStatus
                userObject.put("username", userData[7]);             // Add username

                // Add the user object to the user array
                userArray.put(userObject);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Send a POST request to create the users
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(userArray.toString()) // Send the entire array of users
                .post("/user/createWithList");

        // Print the response for the batch request
        System.out.println("Response code: " + response.getStatusCode());
        System.out.println("Response body: " + response.asString());
    }
}

