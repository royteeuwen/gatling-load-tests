#!/usr/bin/env bash

oc apply -f openshift/build-config.yaml
oc apply -f openshift/deployment.yaml
oc apply -f openshift/route.yaml
oc apply -f openshift/service.yaml

