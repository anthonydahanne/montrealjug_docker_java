FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar  app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
#EXPOSE 8000
#ENTRYPOINT ["java","-Xdebug","-Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]