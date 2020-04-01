package org.medibloc.panacea.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTxsResult {
    @JsonProperty("total_count")
    private String totalCount;
    private String count;
    @JsonProperty("page_number")
    private String pageNumber;
    @JsonProperty("page_total")
    private String pageTotal;
    private String limit;
    private List<TxResponse> txs;
}