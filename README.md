# Post Management Microservice

This microservice provides RESTful API endpoints for managing user posts.

## Technologies Used

- Java 21
- Spring Boot 3.3.0
- Maven
- H2 Database (for local development)
- Spring Data JPA
- Spring Web
- Spring Validation
- Springdoc OpenAPI UI
- Docker (for containerization)

## Prerequisites

- Java Development Kit (JDK) 21 or higher
- Docker (if you want to run the application in a Docker container)

## Installation and Usage

1. **Clone the repository:**

    ```bash
    git clone github.com/1mbanamid/TestTask
    ```

2. **Navigate to the project directory:**

    ```bash
    cd <project-directory>
    ```

3. **Build the project using Maven:**

    ```bash
    mvn clean package
    ```

4. **Run the application:**

    - If you want to run the application locally:

        ```bash
        java -jar target/test-0.0.1-SNAPSHOT.jar
        ```

    - If you want to run the application in a Docker container:

        ```bash
        docker build -t test-app .
        docker run -p 8080:8080 test-app
        ```

5. **Once the application is running, you can access the API documentation using Swagger UI:**

    Open your web browser and go to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

- `POST /api/posts`: Create a new post
- `GET /api/posts/{id}`: Retrieve a post by ID
- `POST /api/posts/user/{userId}`: Retrieve posts by user ID
- `PUT /api/posts/{id}`: Update a post
- `DELETE /api/posts/{id}`: Delete a post

## Running Tests

To run the tests for this application, execute the following command:

```bash
mvn test
```

