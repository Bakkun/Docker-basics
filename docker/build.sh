#!/bin/bash

docker build -f ./docker/Docker.baseimage -t acmecorp/baseimage:latest .

docker build -f ./docker/Docker.server -t acmecorp/server:latest .

docker build -f ./docker/Docker.logreader -t acmecorp/log-reader:latest .