package org.medibloc.panacea;

//public class PanaceaApiException extends RuntimeException {
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

    public PanaceaApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.toString();
        }
        return super.getMessage();
    }
}
