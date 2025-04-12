FROM maven:3.9.9-amazoncorretto-21 AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install

FROM amazoncorretto:21

COPY --from=build /app/target/api-0.0.1-SNAPSHOT.jar /app/app.jar

RUN curl -o /app/wait-for-it.sh https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh
RUN chmod +x /app/wait-for-it.sh

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["/app/wait-for-it.sh", "db:5432", "--", "java", "-jar", "app.jar"]