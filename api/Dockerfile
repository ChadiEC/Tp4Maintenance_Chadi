FROM eclipse-temurin:11-jre

WORKDIR /app

COPY target/todo-0.0.1-SNAPSHOT.jar app.jar

ENV SERVER_ADDRESS=0.0.0.0

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
