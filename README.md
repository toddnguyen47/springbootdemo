# springbootdemo

Spring Boot Demo to keep my knowledge up to date

Run server with

```shell
./gradlew bootRun
```

The server has 2 endpoints:

- `/`: simply return a string
- `/calc`: Accepts a number input, then add the input number a pre-configured number in `application.properties` named `configured.value`

## Checkstyle Setup

To setup checkstyle:
- Go to [config/checkstyle](config/checkstyle) folder
- Make a copy of `sample-checkstyle.xml` and name the file `checkstyle.xml`
- Edit `checkstyle.xml` with whatever rules you'd like
- You're all set!
