FROM openjdk:17-alpine
EXPOSE 8090
ADD target/dockerassignment.jar dockerassignment.jar
ENTRYPOINT ["java", "-jar", "/dockerassignment.jar"]