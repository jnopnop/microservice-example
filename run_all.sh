#!/bin/sh

gradle build
docker-compose up --build
#-d
docker ps