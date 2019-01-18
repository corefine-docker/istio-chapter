FROM openjdk:8
COPY target/*.jar /usr/src/myapp/application.jar
WORKDIR /usr/src/myapp
EXPOSE 8080
CMD ["java", "-Dspring.profiles.active=local", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "application.jar"]