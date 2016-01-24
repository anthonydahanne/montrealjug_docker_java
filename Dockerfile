FROM java:8-jdk
MAINTAINER Anthony Dahanne <anthony.dahanne@gmail.com>
RUN mkdir /app
COPY App.java /app
WORKDIR /app
RUN javac App.java
CMD java App
