package org.medibloc.panacea.encoding.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.medibloc.panacea.Wallet;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter @Setter
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
        String sig = new String(Base64.encodeBase64(wallet.sign(sd)));

        StdSignature stdsig = new StdSignature();
        stdsig.setPubkey(wallet.getPubKeyForSign());
        stdsig.setSignature(sig);

        if (signatures == null) {
            signatures = new ArrayList<>();
        }
        signatures.add(stdsig);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("msgs", msgs)
                .append("fee", fee)
                .append("signatures", signatures)
                .append("memo", memo)
                .toString();
    }
}
