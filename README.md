# *comsat-mvn-archetype*

A [Parallel Universe Comsat](http://www.paralleluniverse.co/comsat/) Maven archetype for servlet-based Java 1.7+ applications.

## Getting started

```
git clone https://github.com/circlespainter/comsat-mvn-archetype
cd comsat-mvn-archetype
mvn install
cd ..
mvn archetype:generate -DarchetypeGroupId=co.paralleluniverse -DarchetypeArtifactId=comsat-mvn-archetype -DarchetypeVersion=0.1.0-SNAPSHOT -DgroupId=testgrp -DartifactId=testprj
cd testprj
mvn -Pjetty8x dependency:properties clean verify
mvn -Pjetty9x dependency:properties clean verify
mvn -Ptomcat7x dependency:properties clean verify
mvn -Ptomcat8x dependency:properties clean verify
```

Other useful properties to set during project generation are `-DjavaVersion=<1.7|1.8> -DquasarVersion=<quasarVersion> -DcomsatVersion=<comsatVerson> -DinstrumentationMethod=<agent|aot|classloader>`
