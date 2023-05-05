# Set the base image to OpenJDK 17
FROM maven:3-openjdk-17-slim

# Set the working directory to /app
WORKDIR /app

# Copy the Maven project to the container
COPY . .

# Build the Maven project
RUN mvn clean package

#Run the Java application when the container starts
CMD ["java", "-jar", "target/back_app.jar"]
