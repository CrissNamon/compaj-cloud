FROM openjdk:11-jdk

WORKDIR /app

COPY /config-server/.mvn/ ./config-server/.mvn
COPY /config-server/src ./config-server/src
COPY /config-server/pom.xml ./config-server
COPY mvnw ./config-server
COPY pom.xml ./

WORKDIR /app/config-server

RUN ./mvnw dependency:go-offline


CMD ["./mvnw", "spring-boot:run"]