FROM openjdk:8-jdk-alpine
VOLUME /tmp

ADD ./target/ProductCatalogues-0.0.1-SNAPSHOT.jar  ProductCatalogues.jar
RUN sh -c 'touch /ProductCatalogues.jar'
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /ProductCatalogues.jar" ]