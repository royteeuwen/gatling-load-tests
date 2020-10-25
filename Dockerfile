FROM jtim/maven-non-root:3.5.4-jdk-8-alpine

USER root
RUN addgroup maven root

USER maven

RUN mkdir /home/maven/gatling
WORKDIR /home/maven/gatling

COPY src/ /home/maven/gatling/src
COPY pom.xml /home/maven/gatling

CMD ["mvn", "gatling:test"]
