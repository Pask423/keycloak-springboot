#!/bin/bash

if [[ ! -d "./logs" ]]
then
    echo "Dir 'logs' not exists. Creating."
    mkdir ./logs
fi

mvn clean package
nohup java -jar ./target/springboot-keycloak-1.0.jar > ./logs/springboot-logs.log &
nohup ./run-keycloak.sh > ./logs/kc-logs.log