FROM openjdk:17-jdk-slim

ADD target/docker-app.jar docker-app.jar

WORKDIR /app

ENTRYPOINT ["java", "-jar", "docker-app.jar"]