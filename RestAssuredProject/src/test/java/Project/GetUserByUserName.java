package Project;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserByUserName {

    public static void main(String[] args) {
        // Base URL of the API
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Sample usernames to retrieve
        String[] usernames = {"john_doe", "jane_smith", "mike_johnson"};

        // Iterate over each username and fetch user details
        for (String username : usernames) {
            try {
                // Send a GET request to fetch the user by username
                Response response = RestAssured.given()
                        .header("Content-Type", "application/json")
                        .get("/user/" + username);

                // Print the response for each user
                System.out.println("Response code for user " + username + ": " + response.getStatusCode());
                System.out.println("Response body: " + response.asString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
