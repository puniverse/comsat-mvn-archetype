# *${groupId}:${projectId}:${version}*

A [Parallel Universe Comsat](http://www.paralleluniverse.co/comsat/) Maven test project for Tomcat standalone Java 1.7+ applications showing how to setup Fiber-blocking Servlets, Jersey (client and server), JDBC, Metrics, Apache HTTP Client with Tomcat 7/8 standalone deployments through Cargo.

## Getting started

```
mvn -Ptomcat7x dependency:properties clean verify
mvn -Ptomcat7x dependency:properties package cargo:run # CTRL+C to stop
mvn -Ptomcat8x dependency:properties clean verify
mvn -Ptomcat7x dependency:properties package cargo:run # CTRL+C to stop
```

The result of cargo deployments can be inspected in `target/cargo/configurations`.
