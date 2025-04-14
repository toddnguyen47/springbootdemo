# springbootdemo
Spring Boot Demo to keep my knowledge up to date

Run server with

```shell
./gradlew bootRun
```

The server has 2 endpoints:

- `/`: simply return a string
- `/calc`: Accepts a number input, then add the input number a pre-configured number in `application.properties` named `configured.value`
