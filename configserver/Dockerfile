FROM java:8
VOLUME /tmp
ADD build/libs/configserver*.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8888
ENTRYPOINT exec java -jar /app.jar
