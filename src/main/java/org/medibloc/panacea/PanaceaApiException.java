package org.medibloc.panacea;

import lombok.Getter;

//public class org.medibloc.panacea.PanaceaApiException extends RuntimeException {
@Getter
public class PanaceaApiException extends Exception {
    private static final long serialVersionUID = 3788669840036201041L;
    private PanaceaApiError error;

    public PanaceaApiException(String message) {
        this.error = new PanaceaApiError(message);
    }
    public PanaceaApiException(Throwable cause) {
        super(cause);
    }
    public PanaceaApiException(String message, Throwable cause) {
        super(message, cause);
        this.error = new PanaceaApiError(message);
    }
    public PanaceaApiException(PanaceaApiError error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.toString();
        }
        return super.getMessage();
    }
}
