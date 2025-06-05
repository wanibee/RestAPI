# 1. Base image (Java 17 기준)
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. 빌드된 JAR 파일을 컨테이너에 복사
COPY target/*.jar app.jar

# 4. JAR 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
