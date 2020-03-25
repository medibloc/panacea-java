package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.net.util.Base64;
import org.medibloc.panacea.Wallet;
import org.medibloc.panacea.domain.message.PanaceaTransactionMessage;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class StdTx {
    @JsonProperty("msg")
    private PanaceaTransactionMessage[] msgs;
    private StdFee fee;
    private List<StdSignature> signatures;
    private String memo;

    public StdTx(PanaceaTransactionMessage msg, StdFee fee, String memo) {
        this.msgs = new PanaceaTransactionMessage[]{msg};
        this.fee = fee;
        this.memo = memo;
    }

    public StdTx(PanaceaTransactionMessage[] msgs, StdFee fee, String memo) {
        this.msgs = msgs;
        this.fee = fee;
        this.memo = memo;
    }

    public void sign(Wallet wallet) throws IOException, NoSuchAlgorithmException {
        StdSignDoc sd = new StdSignDoc();
        sd.setAccountNumber(String.valueOf(wallet.getAccountNumber()));
        sd.setChainId(wallet.getChainId());
        sd.setFee(fee);
        sd.setMemo(memo);
        sd.setMsgs(msgs);
        sd.setSequence(String.valueOf(wallet.getSequence()));
        String sig = Base64.encodeBase64String(wallet.sign(sd));

        StdSignature stdsig = new StdSignature();
        stdsig.setPubkey(wallet.getPubKeyForSign());
        stdsig.setSignature(sig);

        if (signatures == null) {
            signatures = new ArrayList();
        }
        signatures.add(stdsig);
    }

}
