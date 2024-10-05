package Project;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LogOut {

    public static void main(String[] args) {
        logoutUser();
    }

    public static void logoutUser() {
        try {
            Response response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .get("/user/logout");

            System.out.println("Logout Response code: " + response.getStatusCode());
            System.out.println("Logout Response body: " + response.asString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
