# Use official maven/Java 8 image
FROM maven:3.9.2-amazoncorretto-17 AS build

# copy the project files
COPY ./ ./

# build all dependencies for offline use
RUN mvn dependency:go-offline -B

# build for production
RUN mvn clean package -DskipTests

# Use OpenJDK
FROM amazoncorretto:17-alpine-jdk

# copy only the built jar and nothing else
COPY --from=build /target/*.jar /backend.jar

# tell docker what to do when it starts as a container
ENTRYPOINT ["java", "-jar", "/backend.jar"]