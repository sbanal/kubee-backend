
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

