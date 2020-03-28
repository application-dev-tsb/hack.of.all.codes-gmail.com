# Micronaut Experiment
Taking Micronaut and GraalVM for a test run

### Build Instructions
- create the fat jar
```
gradlew assemble
```
- build the GraalVM docker image
```
docker build . -t micronaut
```

### Reference:
- [The Guide](https://guides.micronaut.io/creating-your-first-micronaut-app/guide/index.html)