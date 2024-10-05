package Project;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {

    public static void main(String[] args) {
        String username = "john_doe"; // Replace with the username to delete
        deleteUser(username);
    }

    public static void deleteUser(String username) {
        try {
            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .delete("/user/" + username);

            System.out.println("Delete User Response code: " + response.getStatusCode());
            System.out.println("Delete User Response body: " + response.asString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
