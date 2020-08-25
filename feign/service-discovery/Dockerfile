FROM openjdk:8-jre-alpine
COPY target/*.jar discovery-service.jar
EXPOSE 8761
ENV jvm_param='-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap'
ENV java_prop='-Djava.awt.headless=true -Dspring.jmx.enabled=false'
CMD java -jar ${jvm_param} ${java_prop} discovery-service.jar
