FROM eclipse-temurin:21-jre

WORKDIR /app

COPY build/libs/*.jar app.jar

# 업로드 파일이 저장될 디렉터리
RUN mkdir -p /app/upload

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]