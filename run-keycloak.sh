#!/bin/bash

docker run -p 8090:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin \
    -v $(pwd)/realm.json:/tmp/realm.json \
    -e KEYCLOAK_IMPORT=/tmp/realm.json \
    quay.io/keycloak/keycloak:15.0.2
