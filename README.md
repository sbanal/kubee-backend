
# kubee-backend

This is an example Spring Boot application.
It has one endpoint which responds with a message when a message is submitted with a name parameter.

Example HTTP request can be found [here](example.http)

The response is JSON. For example:
{
    "message": "hello stephen"
}

# Build

```
./gradlew build
```

# Build Image

```
docker build -t kubee-backend .
```

# Run Image

```
docker run -it kubee-backend -p 8080:8080
```

# Publish

Before running commands below ensure that you have Signed-in in your Docker Desktop application.
This assumes you are using docker desktop and you have your own Docker Hub account.

```
docker build -t sbanal/kubee-backend .
docker push sbanal/kubee-backend
```

Test run:
```
docker run -it --rm --name kubee-backend -p 8080:8080 sbanal/kubee-backend
```

# Reference

* https://start.spring.io/
* https://spring.io/guides/topicals/spring-boot-docker/
