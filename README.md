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
    implementation 'org.medibloc.panacea:panacea-java:2.0.1'
}
```

## Feature
* The functions we support are as follows.
    * Broadcast tx
    * Get account / balance / tx(s) / block / node
    * Get aol(topic,record)
    * Get did document

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
        BroadcastMode.BROADCAST_MODE_BLOCK);
```

|BroadcastMode|Description|
|:---|:---|
| BROADCAST_MODE_BLOCK | Waits for the tx to be committed in a block. |
| BROADCAST_MODE_SYNC | Waits for a CheckTx execution response only. |
| BROADCAST_MODE_ASYNC | Returns immediately (transaction might fail) |

***
* Now do broadcast.
```java
TxResponse response = client.broadcast(request);
Assert.assertEquals(0, response.getCode());
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
