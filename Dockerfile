FROM openjdk:17.0.2-oracle
WORKDIR /opt/app
COPY target/docker-challange-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT java -jar app.jar

#ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar app.jar ${0} ${@}"]
#docker run -d -p 9000:9000 -e "JAVA_OPTS=-Ddebug -Xmx128m" myapp  --server.port=9000