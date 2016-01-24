FROM ubuntu:15.10
MAINTAINER Anthony Dahanne <anthony.dahanne@gmail.com>
RUN apt-get update \
  && apt-get install -y openjdk-8-jdk \
  && rm -rf /var/lib/apt/lists/*
RUN mkdir /app
COPY App.java /app
WORKDIR /app
RUN javac App.java
CMD java App
