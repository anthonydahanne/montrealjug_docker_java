To build (java & dockerfile) :

    $ mvn clean package docker:build

and push to the dockerhub registry :

    $ mvn clean package docker:build -DpushImage


Dockerfile info : [https://spring.io/guides/gs/spring-boot-docker/](https://spring.io/guides/gs/spring-boot-docker/)

Docker Maven plugin : [https://github.com/spotify/docker-maven-plugin](https://github.com/spotify/docker-maven-plugin)

