FROM --platform=linux/arm64/v8 openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/add-api-0.0.1-SNAPSHOT.jar add-api.jar
CMD java -jar add-api.jar