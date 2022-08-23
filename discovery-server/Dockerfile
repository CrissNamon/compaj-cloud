FROM openjdk:11-jdk

WORKDIR /app

COPY .mvn/ ./discovery-server/.mvn
COPY /discovery-server/src ./discovery-server/src
COPY /discovery-server/pom.xml ./discovery-server
COPY mvnw ./discovery-server
COPY pom.xml ./

WORKDIR /app/discovery-server

RUN ./mvnw dependency:go-offline


CMD ["./mvnw", "spring-boot:run"]