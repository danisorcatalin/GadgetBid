# Start with a base image containing Java runtime
FROM adoptopenjdk:11-jdk-hotspot

# Add Maintainer Info
LABEL maintainer="catalin@gadgetbid.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's .jar file
ARG JAR_FILE=target/gadget-backend.jar

# Add the application's .jar to the container
ADD ${JAR_FILE} app.jar

# Set environment variables
ENV SECURITY_JWT_SECRET=MVXUR4pZQnF4aUxNM2tuSjd4ZUgNTFhDRTlxbnRtVzN3cX6lSDJRR0xlWnV4RUWWbl
ENV SECURITY_JWT_ISSUER=www.gadgetbid.com
ENV SECURITY_JWT_EXPIRATION_TIME=86400
# Set environment variables for Data base
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://172.17.0.2:5432/gadgetbid
ENV SPRING_DATASOURCE_USERNAME=gadget-mngr
ENV SPRING_DATASOURCE_PASSWORD=sdfGSDFGSDf65gsd4f4gsdfGSDF
ENV SPRING_DATASOURCE_DRIVER_CLASS_NAME=org.postgresql.Driver

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

# Inject the environment variables to the JVM
CMD ["java", "-Dsecurity.jwt.secret=$SECURITY_JWT_SECRET", "-Dsecurity.jwt.issuer=$SECURITY_JWT_ISSUER", "-Dsecurity.jwt.expiration-time=$SECURITY_JWT_EXPIRATION_TIME", "-jar", "/app.jar"]