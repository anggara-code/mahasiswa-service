FROM openjdk:latest
ADD target/mahasiswa.jar /opt/app.jar
RUN bash -c 'touch /opt/app.jar'
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]