#!/usr/bin/env bash

set -euo pipefail

# if [ $1 == 'force' ]; then
#     echo "Forcing delete of possible previous project"
#     PROJECT_EXISTS=$(oc project gatling-load-tests)
#     if [[ $PROJECT_EXISTS == 0 ]]; then
#         echo "Deleting previous project"
#         oc delete project gatling-load-tests
#     fi
# fi

echo "Creating / updating gatling load-tests project"
oc new-project gatling-load-tests

if [ $? == "0" ]; then
    echo "Project does not exist yet, creating build config"
    oc apply -f openshift/build-config.yaml
    oc start-build gatling-load-tests-build

    oc apply -f openshift/image-stream.yaml
    oc apply -f openshift/deployment.yaml
    oc apply -f openshift/route.yaml
    oc apply -f openshift/service.yaml
else
    oc start-build gatling-load-tests-build
fi

