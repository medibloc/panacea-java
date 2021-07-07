#!/bin/bash

set -eo pipefail

rm -rf ~/.panacea

# Initialize the genesis.json file that will help you to bootstrap the network
panacead init node1 --chain-id=testing

# Create a key to hold your validator account
echo -e "${OWNER_MNEMONIC}\n\n" | panacead keys add validator -i
echo -e "${RECIPIENT_MNEMONIC}\n\n" | panacead keys add recipientAccount -i

# Add that key into the genesis.app_state.accounts array in the genesis file
# NOTE: this command lets you set the number of coins. Make sure this account has some coins
# with the genesis.app_state.staking.params.bond_denom denom.
panacead add-genesis-account $(panacead keys show validator -a) 100000000000000umed
panacead add-genesis-account $(panacead keys show toAccount -a) 100000000000000umed

# Generate the transaction that creates your validator
panacead gentx validator 1000000000000umed --commission-rate 0.1 --commission-max-rate 0.2 --commission-max-change-rate 0.01  --min-self-delegation 1000000 --chain-id testing

# Add the generated bonding transaction to the genesis file
panacead collect-gentxs

panacead start