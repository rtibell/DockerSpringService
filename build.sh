#!/bin/sh

# Spring Docker build
#mvn spring-boot:build-image

# Native Docker build
docker build -t rtinnovation/spring-docker-server .
docker run -d -it --name app-server -p 8080:8080 rtinnovation/spring-docker-server
