FROM eclipse-temurin:21-jdk-jammy

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-security-images-new.jar

ENTRYPOINT ["java","-jar","/spring-security-images-new.jar"]
