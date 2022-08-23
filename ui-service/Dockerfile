FROM openjdk:11-jdk

WORKDIR /app

COPY .mvn/ ./ui-service/.mvn
COPY /ui-service/src ./ui-service/src
COPY /ui-service/pom.xml ./ui-service
COPY mvnw ./ui-service
COPY pom.xml ./

WORKDIR /app/ui-service

RUN ./mvnw dependency:go-offline


CMD ["./mvnw", "spring-boot:run"]