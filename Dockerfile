FROM openjdk:8-jre-alpine AS build
COPY target/docker-demo-0.0.1-SNAPSHOT.jar /home/app/docker-demo-0.0.1-SNAPSHOT.jar
WORKDIR /home/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-demo-0.0.1-SNAPSHOT.jar"]