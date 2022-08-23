FROM openjdk:11-jdk

WORKDIR /app

COPY .mvn/ ./discovery-service/.mvn
COPY /discovery-service/src ./discovery-service/src
COPY /discovery-service/pom.xml ./discovery-service
COPY mvnw ./discovery-service
COPY pom.xml ./

WORKDIR /app/discovery-service

RUN ./mvnw dependency:go-offline


CMD ["./mvnw", "spring-boot:run"]