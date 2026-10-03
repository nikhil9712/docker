FROM eclipse-temurin:17-jdk

COPY target/docker-demo-3.5.16.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]