FROM frolvlad/alpine-oraclejdk8:slim

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/build/libs/reqTester-1.0.0.jar"]