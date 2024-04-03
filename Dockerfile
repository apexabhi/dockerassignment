FROM openjdk:17-alpine
EXPOSE 8098
ADD target/dockerassignment.jar dockerassignment.jar
ENTRYPOINT ["java", "-jar", "/dockerassignment.jar"]
