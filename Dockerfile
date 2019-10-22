FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/department-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} department-api.jar
ENTRYPOINT ["java","-jar","/department-api.jar"]