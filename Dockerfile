FROM openjdk:11.0.11-jdk-oracle
COPY build/libs/*.jar products-app.jar
ENTRYPOINT ["java", "-jar", "/products-app.jar", "-web -webAllowOthers -tcp -tcpAllowOthers -browser"]
EXPOSE 8087