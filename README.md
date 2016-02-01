# Montreal JUG presentation : Docker & Java

Some of the code / demos shown during Thursday the 28th of January at the Montreal Java User Group

* [Link to the blog post](http://blog.dahanne.net/2016/01/31/docker-and-java-notes-from-the-montreal-jug-presentation/)
* [slides](http://www.slideshare.net/anthonydahanne/docker-and-java-at-montral-jug)
* [MontrealJUG event](http://www.meetup.com/montreal-jug/events/227440833/)

The code lays in several branches, here are links to those branches :

1. [Hello docker from Java](https://github.com/anthonydahanne/montrealjug_docker_java/tree/01_java_helloworld_dockerfile) : building a minimal java application into a  docker image
2. [Spring boot application in a Docker image](https://github.com/anthonydahanne/montrealjug_docker_java/tree/02_spring_boot_app_docker) : building a minimal spring boot application into a  docker image
3. [Spring boot application in a Docker image, using Maven](https://github.com/anthonydahanne/montrealjug_docker_java/tree/02_spring_boot_app_docker) : building a minimal spring boot application into a docker image, using the docker maven plugin to build the image, and to push it to a registry
4. [Petclinic war image maven build included](https://github.com/anthonydahanne/spring-petclinic/tree/docker-building-war) : build a Docker image from maven, building the webapp war and starting tomcat
5. [Petclinic war image](https://github.com/anthonydahanne/spring-petclinic/tree/docker-war-built) : build a Docker image from tomcat, adding an already built war to it
6. [Spring boot application talking to a Docker daemon using Docker Java](https://github.com/anthonydahanne/montrealjug_docker_java/tree/04_spring_boot_app_docker_api) : reusing the small sprint boot application, adding a dependency to Docker Java, and connecting to a Docker Daemon
