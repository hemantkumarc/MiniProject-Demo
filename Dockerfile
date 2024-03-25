FROM openjdk:11
COPY ./target/SPE-MiniProject-1.0-SNAPSHOT.jar ./app/
WORKDIR ./app/
