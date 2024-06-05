FROM openjdk:21-jdk-slim
WORKDIR /app
RUN apt-get update && apt-get install -y xvfb
COPY point_de_vente.jar .
ENTRYPOINT ["xvfb-run", "java", "-Djava.awt.headless=true", "-jar", "point_de_vente.jar"]