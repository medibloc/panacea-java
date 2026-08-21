# Panacea Java SDK

## Installation

### Gradle

```gradle
repositories {
    maven {
        url = "https://maven.pkg.github.com/medibloc/panacea-java"
        // GitHub Packages credentials
        credentials {
            username = System.getenv("GPR_USER")
            password = System.getenv("GPR_API_KEY")
        }
    }
    mavenCentral()
}

dependencies {
    implementation 'org.medibloc.panacea:panacea-java:2.3.0'
}
```

Use JDK 17 to build the SDK. Published classes remain Java 8 compatible.

## Features

* Broadcast transactions
* Query accounts, balances, transactions, blocks, and nodes
* Query AOL topics and records
* Query DID documents
* Create, mint, transfer, revoke, burn, and query Panacea NFTs

The legacy PNFT query APIs remain available for source compatibility but are deprecated because Panacea Core v2.3.0 removed the PNFT module.

## Testing

```bash
./gradlew build
```

The default build runs local unit tests only. Testnet integration tests are explicit because some of them broadcast transactions and spend testnet tokens.

```bash
export OWNER_MNEMONIC
export RECIPIENT_MNEMONIC
./gradlew integrationTest
```

## Broadcast tx
### Send Coin
* Create a `PanaceaGrpcClient` object.
```java
ManagedChannel channel = ManagedChannelBuilder.forTarget("{ip or domain}:{port}")
            .usePlaintext()
            .build();
PanaceaGrpcClient client = new PanaceaGrpcClient(channel);
```
***
* Create a `Wallet` and init.
* Required your **mnemonic**.
```java
Wallet wallet = Wallet.createWalletFromMnemonicCode(mnemonic, "panacea", 0);
wallet.ensureWalletIsReady(client);
```
***
* Make msg.
* Create MsgSend here.
```java
Coin sendCoin = Coins.createCoin("umed", "100000000");
MsgSend msg = MsgSend.newBuilder()
        .addAmount(sendCoin)
        .setFromAddress(ownerAddress)
        .setToAddress(toAddress)
        .build();
```
***
* Create `BroadcastTxRequest` with `Fee`
```java
Fee fee = Transactions.createFee(Coins.createCoin("umed", "1000"), 200000);
BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
        wallet,
        msg,
        "send coin",
        fee,
        BroadcastMode.BROADCAST_MODE_SYNC);
```

|BroadcastMode|Description|
|:---|:---|
| BROADCAST_MODE_SYNC | Waits for a CheckTx execution response only. |
| BROADCAST_MODE_ASYNC | Returns immediately (transaction might fail) |

`BROADCAST_MODE_BLOCK` is not supported by the Cosmos SDK used in Panacea Core v2.3.0. Poll the transaction after a successful SYNC response to wait for block inclusion.

***
* Now do broadcast.
```java
TxResponse response = client.broadcast(request);
Assert.assertEquals(0, response.getCode());

TxResponse committed = TxUtils.pollTxResponse(client, response.getTxhash(), 10, 1000);
Assert.assertEquals(0, committed.getCode());
```

## Query
* You simply need to call method.

### Account

```java
BaseAccount account = client.getAccount(ownerAddress);
String publicKey = CryptoUtils.getPublicKeyFrom(account);
```

### Balance
```java
Coin ownerCoin = client.getBalance(ownerAddress, "umed");
```

### Node
```java
DefaultNodeInfo nodeInfo = client.getNodeInfo();
```

### Tx
```java
Tx tx = client.getTx(txHash);
```

### TxResponse
```java
TxResponse txResponse = client.getTxResponse(txHash);
```

### Txs
```java
List<Tx> txs = client.getTxsByHeight(height);
```

### TxResponses
```java
List<TxResponse> txResponses = client.getTxResponsesByHeight(height);
```

### Txs and TxResponses with pagination
```java
int offset = 0, limit = 2, total = 0;
while (true) {
    PageRequest pagination = PageRequest.newBuilder().setOffset(offset).setLimit(limit).setCountTotal(true).build();
    GetTxsEventResponse resp = client.getTxsByHeight(height, pagination);
    
    List<Tx> txs = resp.getTxsList();
    List<TxResponse> txResponses = resp.getTxResponsesList();

    offset += resp.getTxsCount();
    total += resp.getTxsCount();
    if (total >= resp.getPagination().getTotal()) {
        break;
    }
}
```

### Block
```java
Block block = client.getBlockByHeight(height);
```

### LastBlock
```java
Block block = client.getLatestBlock();
```

### Panacea NFT

Panacea NFT record list queries use key-based pagination. Use `pagination.next_key` as the next request's key; `offset` and `count_total` are not supported by this endpoint.

```java
PageRequest firstPage = PageRequest.newBuilder()
        .setLimit(100)
        .build();

QueryClassesResponse classes = client.getNftClasses(firstPage);
ClassRecord classRecord = client.getNftClassRecord(classId);
NFTRecord nftRecord = client.getNftRecord(classId, nftId);
QueryNFTRecordsResponse records = client.getNftRecords(classId, ownerAddress, firstPage);

PageRequest nextPage = PageRequest.newBuilder()
        .setKey(records.getPagination().getNextKey())
        .setLimit(100)
        .build();
```

The existing `Transactions` helpers accept the new NFT messages without a separate signing API. Class creation, controller updates, mint, revoke, and burn use `panacea.nft.v1` messages. Transfers use the standard Cosmos NFT `MsgSend`.

```java
BasicNFTData data = BasicNFTData.newBuilder()
        .setName("certificate")
        .build();

MsgMintRequest mint = MsgMintRequest.newBuilder()
        .setClassId(classId)
        .setNftId(nftId)
        .setController(wallet.getAddress())
        .setRecipient(recipientAddress)
        .setData(Any.pack(data, ""))
        .build();

BroadcastTxRequest request = Transactions.createBroadcastTxRequest(
        wallet,
        mint,
        "mint nft",
        fee,
        BroadcastMode.BROADCAST_MODE_SYNC);
```
