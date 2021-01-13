FROM gradle:jdk11 as build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:11.0.9.1-jdk
COPY --from=build /home/gradle/src/build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]