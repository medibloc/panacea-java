#!/bin/bash

##############################################################
# This script updates 3rd-party proto files stored in the 'src/main/resources/proto'
##############################################################

set -eo pipefail

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"

PROTO_PATH="${SCRIPT_DIR}/src/main/resources/proto"

##############################################################
# Download proto files from the 'panacea-core' git repo
##############################################################
PANACEA_CORE_VER_SHORT="ft-na-v2.0.5-cosmos-sdk-v0.45.9-dragonberry"
PANACEA_CORE_VER="ft/na/v2.0.5-cosmos-sdk-v0.45.9-dragonberry"

mkdir -p ${PROTO_PATH}
curl https://codeload.github.com/medibloc/panacea-core/tar.gz/${PANACEA_CORE_VER} | \
	tar -xz -C ${PROTO_PATH} --strip=3 panacea-core-${PANACEA_CORE_VER_SHORT}/third_party/proto
curl https://codeload.github.com/medibloc/panacea-core/tar.gz/${PANACEA_CORE_VER} | \
	tar -xz -C ${PROTO_PATH} --strip=2 panacea-core-${PANACEA_CORE_VER_SHORT}/proto


##############################################################
# Insert the 'java_multiple_files' option, if the file doesn't already contain it.
##############################################################

# Insert the new line after the 'package ...' line
SED_COMMAND='/^package/a\
option java_multiple_files = true;
'

for file in $(find ${PROTO_PATH} -type f -name '*.proto'); do
  if ! grep -q '^option java_multiple_files' ${file}; then
    if [[ `uname` == 'Darwin' ]]; then
      sed -i '' "${SED_COMMAND}" ${file}
    else
      sed -i "${SED_COMMAND}" ${file}
    fi
  fi
done
