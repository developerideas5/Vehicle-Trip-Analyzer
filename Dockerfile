#FROM openjdk:8-jre-alpine
#java ${JVM_ARGS} -jar -Dserver.port=9090 bin/VehicleTripAnalyzer.jar
#ADD target/*.jar VehicleTripAnalyzer.jar
#EXPOSE 9090
#VOLUME bin
#ENTRYPOINT ["java","-jar", "VehicleTripAnalyzer.jar"]

# Set the base image to java8
FROM openjdk:8-alpine

# Define default environment variables
ENV ANALYZER_HOME=/opt
ENV ANALYZER_BINARIES=/opt/bin

# Create directory
RUN mkdir -p $ANALYZER_BINARIES

# Set default directory
WORKDIR $ANALYZER_HOME

# Copy notepad jar file
COPY ./target/*.jar bin/VehicleTripAnalyzer.jar

# Give permissions
RUN chmod 755 bin/VehicleTripAnalyzer.jar

# Expose default servlet container port
EXPOSE 9090

# Main command
CMD ["/usr/bin/java", "-jar", "-Dserver.port=9090", "bin/VehicleTripAnalyzer.jar"]