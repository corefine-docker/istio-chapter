FROM maven:alpine as builder
WORKDIR /usr/src/app
COPY src/ ./src
COPY pom.xml .
RUN mvn -B -e -C -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.0.2:go-offline
RUN mvn -B -e -o -T 1C verify

FROM openjdk:8
WORKDIR /usr/src/app
COPY --from=builder /usr/src/app/target/*.jar ./app.jar
EXPOSE 8080
CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "app.jar"]
