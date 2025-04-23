FROM amazoncorretto:21

WORKDIR /app

COPY target/api-0.0.1-SNAPSHOT.jar /app/app.jar

RUN curl -o /app/wait-for-it.sh https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh
RUN chmod +x /app/wait-for-it.sh

EXPOSE 8080

ENTRYPOINT ["/app/wait-for-it.sh", "db:5432", "--", "java", "-jar", "app.jar"]