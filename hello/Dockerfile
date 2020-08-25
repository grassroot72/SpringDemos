FROM openjdk:8-jre-alpine
COPY target/*.jar app.jar
EXPOSE 8080
ENV jvm_param='-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap'
ENV java_prop='-Djava.awt.headless=true -Dspring.jmx.enabled=false'
CMD java -jar ${jvm_param} ${java_prop} app.jar
