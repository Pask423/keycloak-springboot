## Info

Directory for an article about securing [Spring Boot based REST APIs with Keycloak](https://dzone.com/articles/secure-spring-boot-application-with-keycloak).

## Running locally

### Keycloak
If you only want to use preconfigured Keycloak instance just run the [run-keycloak.sh](../run-keycloak.sh) script.
It will run the Keycloak docker image with the configuration described in the article.  
Keycloak realm configuration is present in [realm/realm.json](../realm/realm.json) file.
All additional configuration and customization can be done from there.

### Keycloak and Spring Boot
To set up this environment locally just run the [deploy.sh](deploy.sh) script in one of the project directories.
It will compile the application and prepare a [springboot-keycloak-1.0.jar](target/spring-boot-3-keycloak-1.0.jar) jar.
Then script will run the jar alongside Keycloak docker.
