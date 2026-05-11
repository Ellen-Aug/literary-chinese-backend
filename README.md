# Literary Chinese Junior - Backend

Spring Boot 3.3 + Java 17 + Spring Data JPA backend.

## How to run

### Local
```bash
./mvnw spring-boot:run -Dspring.profiles.active=local
```

### Production
```bash
java -jar target/literary-chinese-backend-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```