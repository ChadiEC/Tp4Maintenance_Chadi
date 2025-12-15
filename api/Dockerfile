FROM eclipse-temurin:21-jdk-jammy AS builder

 WORKDIR /app
    

COPY pom.xml .
COPY settings.xml .
COPY src src
RUN --mount=type=cache,target=/root/.m2 mvn clean package -DskipTests
ARG JAR_FILE=target/your-app-name-0.0.1-SNAPSHOT.jar
FROM eclipse-temurin:21-jre-jammy
ARG JAR_FILE
WORKDIR /app
    
COPY --from=builder /app/${JAR_FILE} app.jar
    
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080