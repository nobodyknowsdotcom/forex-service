FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine
ADD . /src
WORKDIR /src
RUN ./mvnw package -DskipTests
EXPOSE 8000
ENTRYPOINT ["java","-jar","CurrencyConverter-0.0.1-SNAPSHOT.jar"]