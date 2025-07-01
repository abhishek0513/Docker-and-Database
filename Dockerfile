FROM openjdk:17-jdk-slim

ADD rest-demo.jar /app/rest-demo.jar

WORKDIR /app

ENTRYPOINT ["java", "-jar", "rest-demo.jar"]