## Info

A common repository for Keycloak and Spring Boot [article series](https://pasksoftware.com/series/#Security_Keycloak)

1. Base integration: 
   1. article: [Pask Software](https://pasksoftware.com/spring-boot-keycloak/)
   2. [code](/base-integration)
2. Base integration with Spring Boot 3:
   1. article: [Pask Software](https://pasksoftware.com/spring-boot-3-keycloak/)
   2. [code](/base-integration-spring-boot-3)

## Running locally

### Keycloak
If you only want to use preconfigured Keycloak instance just run the [run-keycloak.sh](run-keycloak.sh) script. 
It will run the Keycloak docker image with the configuration described in the article.  
Keycloak realm configuration is present in [realm/realm.json](realm/realm.json) file.
All additional configuration and customization can be done from there.

### Keycloak and Spring Boot
To set up this environment locally just run the [deploy.sh](base-integration/deploy.sh) script in one of the project directories.
It will compile the application and prepare a runnable jar.
Then script will run the jar alongside Keycloak docker.

## Testing locally

Directory [http](http) contains a set of requests in the form of [base.http](http/base.http) 
file for IntelliJ build-in HTTP client.

Requests:
   1. GET http://localhost:8080/hello
   2. POST http://localhost:8090/realms/demo/protocol/openid-connect/token

The request allow for manual testing of the running application.

Only after calling the `token` request the `hello` request will return the `200` HTTP code.
The first call of a `hello` request should return a `401` HTTP code.
