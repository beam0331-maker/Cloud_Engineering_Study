FROM eclipse-temurin:21-jre

WORKDIR /app

COPY build/libs/*.jar app.jar

ENV SERVER_PORT=8080
ENV APP_NAME=spring-env-demo
ENV APP_MESSAGE="Dockerfile 기본 메시지"
ENV APP_UPLOAD_DIR=/app/upload
ENV SPRING_PROFILES_ACTIVE=prod

RUN mkdir -p /app/upload

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]