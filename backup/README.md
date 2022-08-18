# Micronaut Experiment
Taking Micronaut and GraalVM for a test run

### Build Instructions
- create the fat jar
```
gradlew generateGitProperties assemble
```
- build the GraalVM docker image
```
docker build . -t micronaut:0.1.0
```
- run, just to check if its working
```
docker run -p 8080:8080 micronaut:0.1.0
```

### Reference:
- [The Guide](https://guides.micronaut.io/creating-your-first-micronaut-app/guide/index.html)