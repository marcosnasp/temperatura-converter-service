FROM maven:3-eclipse-temurin-20 as build
RUN mkdir /usr/src/temperatura-converter-service
COPY . /usr/src/temperatura-converter-service
WORKDIR /usr/src/temperatura-converter-service
RUN mvn package -DskipTests
RUN jar xf target/temperatura-converter-service-0.0.1.jar
RUN jdeps --ignore-missing-deps -q \
    --recursive \
    --multi-release 20 \
    --print-module-deps \
    --class-path='BOOT-INF/lib/*' \
    --add-modules spring.web, spring.boot, spring.context, spring.boot.autoconfigure, spring.beans \
    ./target/temperatura-converter-service-0.0.1.jar > deps.info
RUN jlink \
    --add-modules $(cat deps.info) \
    --strip-debug \
    --compress 2 \
    --no-header-files \
    --no-man-pages \
    --output /jre20
FROM debian:bookworm-slim
ENV JAVA_HOME /user/java/jdk20
ENV PATH $JAVA_HOME/bin:$PATH
COPY --from=build /jre20 $JAVA_HOME
RUN mkdir /temperatura-converter-service
COPY --from=build /usr/src/temperatura-converter-service/target/temperatura-converter-service-0.0.1.jar /temperatura-converter-service/
WORKDIR /temperatura-converter-service
ENTRYPOINT java -jar temperatura-converter-service-0.0.1.jar