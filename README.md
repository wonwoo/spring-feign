## spring feign example

### How to run

```
git clone https://github.com/wonwoo/spring-feign.git
mvn install
```
#### server
```
java -jar server/target/server-0.0.1-SNAPSHOT.jar
```

#### client
```
java -jar client/target/client-0.0.1-SNAPSHOT.jar
```

### Test
> HTTPie https://httpie.org/


#### get test

```http
http localhost:8080

HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Date: Sun, 13 Aug 2017 14:17:30 GMT
Transfer-Encoding: chunked

[
    {
        "email": "test@test.com",
        "name": "wonwoo"
    },
    {
        "email": "kevin@test.com",
        "name": "kevin"
    }
]
```

#### post test

```http
http POST localhost:8080 name=test email=test@test.com

HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Date: Sun, 13 Aug 2017 14:20:53 GMT
Transfer-Encoding: chunked

{
    "email": "test@test.com",
    "name": "test"
}
```

#### delete test

```http
http DELETE localhost:8080/test
HTTP/1.1 200
Content-Length: 0
Date: Sun, 13 Aug 2017 14:21:31 GMT
```
