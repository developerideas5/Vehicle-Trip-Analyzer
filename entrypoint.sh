#!/bin/bash
cp ${ANALYZER_HOME}/VehicleTripAnalyzer.jar bin/VehicleTripAnalyzer.jar
java ${JVM_ARGS} -jar -Dserver.port=9090 bin/VehicleTripAnalyzer.jar