FROM java:8
VOLUME /tmp
ADD build/libs/ms_employee*.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT exec java $JVM_OPTS -jar /app.jar
