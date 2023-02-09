FROM ubi8/openjdk-11

WORKDIR /app

COPY ./target/web-back-0.0.1-SNAPSHOT.jamvn r /app

EXPOSE 8080

CMD ["java", "-jar", "web-back-0.0.1-SNAPSHOT.jar"]