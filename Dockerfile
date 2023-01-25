FROM openjdk:12
ADD target/stress-test-0.0.1-SNAPSHOT.jar stress-test-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "stress-test-0.0.1-SNAPSHOT.jar"]