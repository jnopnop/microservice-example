#!/bin/sh

DOCKER_CMD=""
if [[ "$1" == "debug" ]]; then
    DOCKER_CMD=" -f docker-compose-debug.yml"
fi

docker-compose ${DOCKER_CMD} stop
docker ps