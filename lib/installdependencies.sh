#!/bin/bash
mvn install:install-file -Dfile=sbolstack-frontend-1.0-SNAPSHOT-withDependencies.jar -DgroupId=org.sbolstack.frontend -DartifactId=sbolstack-frontend -Dversion=1.0-SNAPSHOT -Dpackaging=jar
