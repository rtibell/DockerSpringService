#!/bin/sh

docker pull ubuntu/prometheus
docker run -d --name prometheus-container -e TZ=UTC -p 30090:9090 ubuntu/prometheus:latest

