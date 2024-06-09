FROM amazoncorretto:17-alpine3.19-jdk

EXPOSE 8080

WORKDIR /app

COPY target/*.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

