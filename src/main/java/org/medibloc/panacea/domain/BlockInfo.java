package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockInfo {
    @JsonProperty("block_meta")
    private BlockMeta blockMeta;
    private Block block;

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BlockMeta {
        @JsonProperty("block_id")
        private BlockId blockId;
        private Header header;
    }

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BlockId {
        private String hash;
        private Parts parts;
    }

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Parts {
        private String total;
        private String hash;
    }

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Block {
        private Header header;
        private Data data;
        private Evidence evidence;
        @JsonProperty("last_commit")
        private LastCommit lastCommit;

        @Getter @Setter @ToString
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Data {
            private List<String> txs;
        }

        @Getter @Setter @ToString
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Evidence {
            private Object evidence;
        }

        @Getter @Setter @ToString
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class LastCommit {
            @JsonProperty("block_id")
            private BlockId blockId;
            private List<PreCommit> precommits;

            @Getter @Setter @ToString
            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class PreCommit {
                private int type;
                private String height;
                private String round;
                @JsonProperty("block_id")
                private BlockId blockId;
                private Date timestamp;
                @JsonProperty("validator_address")
                private String validatorAddress;
                @JsonProperty("validator_index")
                private String validatorIndex;
                private String signature;

            }
        }
    }


    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Header {
        private Version version;
        @JsonProperty("chain_id")
        private String chainId;
        private Long height;
        private Date time;
        @JsonProperty("num_txs")
        private String numTxs;
        @JsonProperty("total_txs")
        private String totalTxs;
        @JsonProperty("last_block_id")
        private BlockId lastBlockId;
        @JsonProperty("last_commit_hash")
        private String lastCommitHash;
        @JsonProperty("data_hash")
        private String dataHash;
        @JsonProperty("validators_hash")
        private String validatorsHash;
        @JsonProperty("next_validators_hash")
        private String nextValidatorsHash;
        @JsonProperty("consensus_hash")
        private String consensusHash;
        @JsonProperty("app_hash")
        private String appHash;
        @JsonProperty("last_results_hash")
        private String lastResultHash;
        @JsonProperty("evidence_hash")
        private String evidenceHash;
        @JsonProperty("proposer_address")
        private String proposerAddress;
    }

    @Getter @Setter @ToString
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Version {
        private String block;
        private String app;
    }
}
