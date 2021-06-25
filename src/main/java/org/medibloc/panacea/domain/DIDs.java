package org.medibloc.panacea.domain;

import org.bitcoinj.core.Base58;
import org.medibloc.panacea.DIDWallet;
import org.medibloc.panacea.type.Context;
import org.medibloc.panacea.type.DIDKey;
import panacea.did.v2.DIDDocument;
import panacea.did.v2.Strings;
import panacea.did.v2.VerificationMethod;
import panacea.did.v2.VerificationRelationship;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;

public class DIDs {
    public static String createDID(byte[] pubKey) throws NoSuchAlgorithmException {
        return String.format("did:panacea:%s", encodePubKey(pubKey));
    }

    private static String encodePubKey(byte[] pubKey) throws NoSuchAlgorithmException {
        return Base58.encode(MessageDigest.getInstance("SHA-256").digest(pubKey));
    }


    public static VerificationMethod createVerificationMethod(String did, DIDWallet wallet, String key) {
        byte[] pubKey = wallet.getPubKeyBytes();

        return VerificationMethod.newBuilder()
                .setID(createVerificationMethodId(did, key))
                .setType(DIDKey.ES256K.getValue())
                .setController(did)
                .setPubKeyBase58(Base58.encode(pubKey))
                .build();
    }

    public static String createVerificationMethodId(String did, String key) {
        return String.format("%s#%s", did, key);
    }

    public static VerificationRelationship createVerificationRelationship(String verificationMethodId) {
        return VerificationRelationship.newBuilder()
                .setVerificationMethodID(verificationMethodId)
                .build();
    }

    public static VerificationRelationship createVerificationRelationship(VerificationMethod verificationMethod) {
        return VerificationRelationship.newBuilder()
                .setVerificationMethodID(verificationMethod.getID())
                .setDedicatedVerificationMethod(verificationMethod)
                .build();
    }

    public static DIDDocument createDIDDocument(String did, DIDWallet wallet) {
        VerificationMethod verificationMethod = createVerificationMethod(did, wallet, "key1");

        VerificationRelationship authentication = createVerificationRelationship(verificationMethod.getID());

        return createDIDDocument(
                Collections.singletonList(Context.DID_V1.getValue()),
                did,
                Collections.singletonList(verificationMethod),
                Collections.singletonList(authentication));
    }

    public static DIDDocument createDIDDocument(List<String> contexts,
                                                String did,
                                                List<VerificationMethod> verificationMethods,
                                                List<VerificationRelationship> authentications) {
        return DIDDocument.newBuilder()
                .setContexts(Strings.newBuilder()
                        .addAllValues(contexts)
                        .build())
                .setID(did)
                .addAllVerificationMethods(verificationMethods)
                .addAllAuthentications(authentications)
                .build();
    }
}
