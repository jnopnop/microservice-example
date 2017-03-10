FROM java:8
VOLUME /tmp
ADD build/libs/shipment.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8001", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
