FROM java:8
VOLUME /tmp
ADD build/libs/ms_employee.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
