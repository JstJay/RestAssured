
# Petstore API Testing with REST Assured

This project validates various Petstore API endpoints using REST Assured in Java. The tests cover user-related API operations like creating users, retrieving a user by username, updating users, and managing user sessions.

## Objective

To validate the Petstore API endpoints by implementing automated tests using REST Assured in a Maven project.

## Tools & Technologies

- **IDE:** Spring Tool Suite or Eclipse
- **Java:** 8+
- **REST Assured Library**
- **Maven**

## API Endpoints Tested

The following endpoints from the Petstore API are validated using REST Assured:

1. **Create a list of users with a given input array**
   - Verifies the API functionality to create multiple users from an input list.
   
2. **Get user by username**
   - Retrieves a specific user's information using the username.
   
3. **Update user**
   - Updates the details of an existing user.
   
4. **Delete user**
   - Deletes a user by their username.
   
5. **Log user into the system**
   - Logs in a user with valid credentials.
   
6. **Log out current logged-in user**
   - Logs out the currently authenticated user.
   
7. **Create a user**
   - Creates a new user with the provided details.

## Logging and Validation

For each API operation, the following details are recorded:

- **Status Code:** The HTTP response code returned by the API.
- **Response Output:** The actual response body returned by the API.
- **Log Results:** Detailed logs are maintained for each request and response for easier debugging.

## Execution

1. **Run the Tests:** Use TestNG/JUnit test runners to execute the test cases.
2. **View Results:** After running the tests, you can check the logs and reports to see the status of each endpoint validation.

## API Documentation

For more details on the API and its structure, refer to the official [Petstore API Documentation](https://petstore.swagger.io/#/).
