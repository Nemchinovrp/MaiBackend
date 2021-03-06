FROM openjdk:8-jdk-alpine

LABEL maintainer="nemchinorp@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/backend-1.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} backend-1.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/backend-1.0.1-SNAPSHOT.jar"]