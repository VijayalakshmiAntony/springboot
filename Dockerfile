FROM openjdk:17-jdk-slim-buster
# cd /opt/app
WORKDIR /opt/app

# Refer to Maven build -> finalName
ARG JAR_FILE=target/studentms-0.0.1-SNAPSHOT.jar

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} studentmsapi.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","studentmsapi.jar"]