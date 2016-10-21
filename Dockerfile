FROM openjdk:8-jdk-alpine
MAINTAINER Anthony Dahanne <anthony.dahanne@gmail.com>
RUN mkdir /app
COPY App.java /app
WORKDIR /app
RUN javac App.java
CMD java App
