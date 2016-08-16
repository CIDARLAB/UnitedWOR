#!/bin/bash
mvn install:install-file -Dfile=sbolstack-frontend-1.0-SNAPSHOT-withDependencies.jar -DgroupId=org.sbolstack.frontend -DartifactId=sbolstack-frontend -Dversion=1.0-SNAPSHOT -Dpackaging=jar
mvn install:install-file -Dfile=ICERestAPIJava-1.0.jar -DgroupId=org.cidarlab -DartifactId=ICERestAPIJava -Dversion=1.0 -Dpackaging=jar
mvn install:install-file -Dfile=sbolstack-frontend-1.0-SNAPSHOT-withDependencies.jar -DgroupId=org.sbolstandard -DartifactId=libSBOLj -Dversion=2.1.0 -Dpackaging=jar
