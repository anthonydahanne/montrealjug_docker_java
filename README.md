To build (java & dockerfile) :

    $ mvn clean package docker:build

To run :

    $ docker run -p 8080:8080 --link socat:socat --name=demo -d  anthonydahanne/demo --dockerUrl=http://socat:2375

and push to the dockerhub registry :

    $ mvn clean package docker:build -DpushImage


Dockerfile info : [https://spring.io/guides/gs/spring-boot-docker/](https://spring.io/guides/gs/spring-boot-docker/)

Docker Maven plugin : [https://github.com/spotify/docker-maven-plugin](https://github.com/spotify/docker-maven-plugin)

Docker Java : [https://github.com/docker-java/docker-java/wiki](https://github.com/docker-java/docker-java/wiki)
