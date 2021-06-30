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
    compile group: 'org.medibloc.panacea', name: 'panacea-java', version: '2.0.0'
}
```

## Feature
* The functions we support are as follows.
    * Broadcast tx
        * [GrpcBroadcastTest](src/test/java/org/medibloc/panacea/GrpcBroadcastTest.java) (send coin)
    * Get account / balance / tx(s) / block / node
        * [GrpcQueryTest](src/test/java/org/medibloc/panacea/GrpcQueryTest.java)
    * Get aol(topic,record)
        * [GrpcAolTest](src/test/java/org/medibloc/panacea/GrpcAolTest.java)
    * Get did document
        * [GrpcDIDTest](src/test/java/org/medibloc/panacea/GrpcDIDTest.java)

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

### TxResponse
```java
TxResponse txResponse = client.getTxResponse(txHash);
```

### TxResponses
```java
List<TxResponse> txResponses = client.getTxResponsesByHeight(height);
```

### Block
```java
Block block = client.getBlockByHeight(height);
```

### LastBlock
```java
Block block = client.getLatestBlock();
```
