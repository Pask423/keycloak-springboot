#!/bin/bash

docker run -p 8090:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin \
    -e KEYCLOAK_IMPORT=/tmp/realm.json \
    -v /PASK_CUSTOM_SOFTWARE/PROJECTS/keycloak-springboot-article/realm.json:/tmp/realm.json \
    quay.io/keycloak/keycloak:12.0.1
