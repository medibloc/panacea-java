package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockInfo {
    @JsonProperty("block_meta")
    private BlockMeta blockMeta;

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BlockMeta {
        @JsonProperty("block_id")
        private BlockId blockId;
        private Header header;
    }

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Header {
        @JsonProperty("chain_id")
        private String chainId;
        private Long height;
        private Date time;
        @JsonProperty("num_txs")
        private Long numTxs;
        @JsonProperty("total_txs")
        private Long totalTxs;
        @JsonProperty("last_block_id")
        private BlockId lastBlockId;
    }

    @Getter @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BlockId {
        private String hash;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("blockId", blockMeta.blockId.hash)
                .append("chainId", blockMeta.header.chainId)
                .append("height", blockMeta.header.height)
                .append("time", blockMeta.header.time)
                .append("numTxs", blockMeta.header.numTxs)
                .append("totalTxs", blockMeta.header.totalTxs)
                .append("lastBlockId", blockMeta.header.lastBlockId.hash)
                .toString();
    }
}
