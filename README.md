## Info

Repo for my article about securing [Spring Boot based REST APIs with Keycloak](https://dzone.com/articles/secure-spring-boot-application-with-keycloak).

## Running locally

##### Disclaimer
No changes should be necessary to run this example locally.
In case you will need to do any changes I recommend importing project to IDE and doing them from there.

### Keycloak
If you only want to use preconfigured Keycloak instance just run `run-keycloak.sh` script.
It will run Keycloak docker image with configuration described in the article.  
Keycloak realm configuration is present in `realm.json` file. You can configure it from there.

### Keycloak and Spring Boot
To set up this environment locally just run `deploy.sh` script in root project directory.
It will compile java application and prepare `springboot-keycloak-1.0.jar`. 
Then script will run jar alongside Keycloak docker.
