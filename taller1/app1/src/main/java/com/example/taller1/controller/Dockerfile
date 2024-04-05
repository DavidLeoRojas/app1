# Usa una imagen base de Java

FROM maven:3.8.3-openjdk-17 as builder

ARG GIT_USER=Juanestebang23

ARG GIT_TOKEN=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

WORKDIR /app

RUN git clone https://github.com/DavidLeoRojas/app1.git /opt/project

WORKDIR /app/SpringBootForDocker/demo

RUN mvn install package

FROM openjdk:17-alpine

RUN mkdir -p /app/SpringBootForDocker

WORKDIR /app/SpringBootForDocker

COPY --frombuild opt/project/target/*.jar api.jar

ENTRYPOINT ["java", "-jar","api.jar"]



