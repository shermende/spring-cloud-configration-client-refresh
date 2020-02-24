FROM gradle:5.2.1-jdk11
COPY build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]