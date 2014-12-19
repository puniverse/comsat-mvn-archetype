# *${groupId}:${projectId}:${version}*

A [Parallel Universe Comsat](http://www.paralleluniverse.co/comsat/) Maven test project for servlet-based Java 1.7+ applications.

## Getting started

```
mvn -Pjetty8x dependency:properties clean verify
mvn -Pjetty9x dependency:properties clean verify
mvn -Ptomcat7x dependency:properties clean verify
mvn -Ptomcat8x dependency:properties clean verify
```