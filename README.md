# *comsat-mvn-archetype*

A [Parallel Universe Comsat](http://www.paralleluniverse.co/comsat/) Maven archetype for both Dropwizard embedded and Tomcat standalone Java 1.7+ applications showing how to setup Comsat's fiber-blocking servlets, Jersey (client and server), JDBC, Metrics and Apache HTTP Client. Tomcat 7/8 standalone deployments are managed through Cargo.

## Getting started

```
git clone https://github.com/puniverse/comsat-mvn-archetype
cd comsat-mvn-archetype
mvn install
cd ..
mvn archetype:generate -DarchetypeGroupId=co.paralleluniverse -DarchetypeArtifactId=comsat-mvn-archetype -DarchetypeVersion=0.1.2 -DgroupId=testgrp -DartifactId=testprj
cd testprj
mvn -Ptomcat7x dependency:properties clean verify
mvn -Ptomcat7x dependency:properties package cargo:run # CTRL+C to stop
mvn -Ptomcat8x dependency:properties clean verify
mvn -Ptomcat8x dependency:properties package cargo:run # CTRL+C to stop
mvn -Pdropwizard dependency:properties clean compile exec:exec # CTRL+C to stop
```

Other useful properties to set during project generation are `-DjavaVersion=<1.7|1.8> -DquasarVersion=<quasarVersion, e.g. 0.6.2> -DcomsatVersion=<comsatVersion, e.g. 0.3.0> -Dtomcat7Version=<tomcat7Version, e.g. 7.0.56> -Dtomcat8Version=<tomcat8Version, e.g. 8.0.15> -DuseWebXml=<true|false>`

The result of cargo deployments can be inspected in `target/cargo/configurations`.
