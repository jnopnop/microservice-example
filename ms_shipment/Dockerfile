FROM java:8
VOLUME /tmp
ADD build/libs/ms_shipment*.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT exec java $JVM_OPTS -jar /app.jar
#CMD ["-e $JVM_OPTS"]
