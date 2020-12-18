FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD target/goden-0.0.1-SNAPSHOT.jar goden.jar
EXPOSE 8080
RUN bash -c 'touch /goden.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/goden.jar"]
