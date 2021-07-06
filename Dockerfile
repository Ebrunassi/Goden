FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD target/goden-0.0.1-SNAPSHOT.jar goden.jar
EXPOSE 8080
RUN bash -c 'touch /goden.jar'
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/goden.jar"]
