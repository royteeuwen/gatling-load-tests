FROM jtim/maven-non-root:3.5.4-jdk-8-alpine

RUN mkdir /home/maven/gatling
WORKDIR /home/maven/gatling

COPY src/ /home/maven/gatling/src
COPY pom.xml /home/maven/gatling

USER root
RUN chown maven:root /home/maven -R
RUN chmod -R 775 /home/maven

CMD ["mvn", "gatling:test", "-s", "/home/maven/.m2/settings.xml"]