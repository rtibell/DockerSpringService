#!/bin/sh

# Prometheus
docker pull ubuntu/prometheus
docker run -d --name prometheus-container -e TZ=UTC -p 30090:9090 ubuntu/prometheus:latest

# Grafana
GDIR=/Users/rasse/tmp/grafana
ID=$(id -u) # saves your user id in the ID variable
docker run -d --user $ID --volume "$GDIR:/var/lib/grafana" -p 3000:3000 grafana/grafana-enterprise:8.2.1

# Mongo
docker pull mongo
docker run --name rtmongo -p 27017:27017 -v /Users/rasse/tmp/mongodb:/data/db -d mongo
