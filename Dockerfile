FROM jtim/maven-non-root:3.5.4-jdk-8-alpine

RUN mkdir /home/maven/gatling
WORKDIR /home/maven/gatling

COPY src/ /home/maven/gatling/src
COPY pom.xml /home/maven/gatling

CMD ["mvn", "gatling:test"]
