# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the project’s build artifacts to the container
COPY target/test-0.0.1-SNAPSHOT.jar /app/test.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "test.jar"]
