#!/bin/bash

##############################################################
# This script updates 3rd-party proto files stored in the 'src/main/resources/proto'
##############################################################

set -eo pipefail

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"

PROTO_PATH="${SCRIPT_DIR}/src/main/resources/proto"

rm -rfv ${PROTO_PATH}

buf export buf.build/medibloc/panacea-core -o ${PROTO_PATH}
buf export buf.build/cosmos/cosmos-sdk -o ${PROTO_PATH}
buf export buf.build/cosmos/gogo-proto -o ${PROTO_PATH}

## Delete nft proto because is not required and error class name.
rm -rfv src/main/resources/proto/cosmos/nft
## Delete google dependency
rm -rfv src/main/resources/proto/google

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
