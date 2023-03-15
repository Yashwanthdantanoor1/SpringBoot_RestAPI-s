FROM openjdk:11

COPY target/proj1-0.0.1-SNAPSHOT.jar dockersbemployee.jar

ENTRYPOINT [ "java", "-jar", "/dockersbemployee.jar" ]

