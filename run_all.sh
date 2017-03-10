#!/bin/sh

gradle build
docker-compose up
docker ps
