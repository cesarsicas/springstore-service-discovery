FROM openjdk:17-oracle
ARG JAR_FILE=./target/*.jar
EXPOSE 8761
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

#docker container run -p 8761:8761 --name springstore-service-discovery cesarsicas/springstore-service-discovery:0.0.1