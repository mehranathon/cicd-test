# Use Amazon Linux 2 as the base image
FROM amazonlinux:2

# Install curl using yum
RUN yum update -y && \
    yum install -y curl && \
    yum clean all

FROM gradle:8.8-jdk17 AS build
WORKDIR /app
COPY --chown=gradle:gradle . /app
RUN gradle clean build -x test --no-daemon

FROM openjdk:17-jdk-slim
EXPOSE 80
COPY --from=build /app/build/libs/*.jar /app/spring-boot-application.jar
ENTRYPOINT ["java", "-jar", "/app/spring-boot-application.jar"]