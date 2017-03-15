#FROM java:8
#VOLUME /tmp
#ADD build/libs/configserver*.jar app.jar
#RUN bash -c 'touch /app.jar'
#EXPOSE 8888
#ENTRYPOINT exec java -jar /app.jar

FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd && apk add curl
RUN mkdir -p /usr/local/configserver
RUN echo $JAVA_HOME
RUN cd /tmp/ && \
    curl -LO "http://download.oracle.com/otn-pub/java/jce/8/jce_policy-8.zip" -H 'Cookie: oraclelicense=accept-securebackup-cookie' && \
    unzip jce_policy-8.zip && \
    rm jce_policy-8.zip && \
    yes |cp -v /tmp/UnlimitedJCEPolicyJDK8/*.jar /usr/lib/jvm/java-1.8-openjdk/jre/lib/security/
ADD build/libs/configserver*.jar app.jar
#CMD keytool -genkeypair -alias mytestkey -keyalg RSA \
#      -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" \
#      -keypass changeme -keystore /server.jks -storepass letmein
ENTRYPOINT exec java $JVM_OPTS -jar /app.jar