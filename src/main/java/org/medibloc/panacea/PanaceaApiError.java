package org.medibloc.panacea;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public class PanaceaApiError {
    private String error;

    public PanaceaApiError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("error", error)
                .toString();
    }
}
