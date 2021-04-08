from openjdk:8

MAINTAINER Carlos Prado

WORKDIR /app

EXPOSE 99

ADD target/tickets-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar", "tickets-0.0.1-SNAPSHOT.jar"]