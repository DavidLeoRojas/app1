# Usa una imagen base de Java
FROM openjdk-17 as builder

ARG GIR_USER=DavidLeoRojas
ARG GIT_TOKEN=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

RUN git clone https://github.com/DavidLeoRojas/taller1conten.git /opt/project
WORKDIR /opt/project

RUN mvn install

FROM openjdk-17-alpine
RUN mkdir /opt/project

WORKDIR /opt/project
COPY --frombuild opt/project/target/*.jar api.jar
ENTRYPOINT ["java", "-jar", "api.jar"]