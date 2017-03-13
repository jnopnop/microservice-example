#!/bin/sh

./gradlew build

DOCKER_CMD="up --build -d"
if [[ "$1" == "debug" ]]; then
    echo "Starting in debug mode..."
    DOCKER_CMD=" -f docker-compose-debug.yml ${DOCKER_CMD}"
fi

docker-compose ${DOCKER_CMD}
docker ps