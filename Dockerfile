# Start from Java base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy jar into container
COPY target/EMS-Application-0.0.1-SNAPSHOT.jar app.jar

# Expose the port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]