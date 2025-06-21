# Stage 1: Build the application
FROM gradle:8.8-jdk17-alpine AS build
WORKDIR /app
COPY --chown=gradle:gradle . /app
RUN gradle clean build --no-daemon
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
