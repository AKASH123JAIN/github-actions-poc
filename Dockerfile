FROM openjdk:22-jdk-slim
EXPOSE 8080
ADD target/aj-github-actions.jar aj-github-actions.jar
ENTRYPOINT ["java","-jar","/aj-github-actions.jar"]