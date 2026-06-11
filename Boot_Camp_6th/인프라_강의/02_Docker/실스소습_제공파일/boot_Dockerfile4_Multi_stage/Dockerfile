# 멀티 스테이지 패턴 적용 후 코드임
# ======================
# Build Stage
# ======================
FROM gradle:8.10.2-jdk21 AS builder

WORKDIR /build

COPY . .

RUN gradle clean bootJar

# ======================
# Runtime Stage
# ======================
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder \
     /build/build/libs/*.jar \
     app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]