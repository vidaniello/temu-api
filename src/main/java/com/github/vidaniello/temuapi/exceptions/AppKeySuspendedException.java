package com.github.vidaniello.temuapi.exceptions;

public class AppKeySuspendedException extends TemuException {

    private static final long serialVersionUID = 1L;
    
    private static final int ERROR_CODE = 3000028;
    private static final String ERROR_MSG = "app_key have been suspended, please contact temu product support team to recover your app status.";
    private static final String DESCRIPTION = "The APP status is unavailable.";
    
    private final String errorMsgFromResponse;
    
    public AppKeySuspendedException() {
        super(ERROR_MSG);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AppKeySuspendedException(Exception exception) {
        super(ERROR_MSG, exception);
        this.errorMsgFromResponse = ERROR_MSG;
    }
    
    public AppKeySuspendedException(String errorMsgFromResponse) {
        super(errorMsgFromResponse);
        this.errorMsgFromResponse = errorMsgFromResponse;
    }
    
    public int getErrorCode() {
        return ERROR_CODE;
    }
    
    public String getErrorMsg() {
        return ERROR_MSG;
    }
    
    public String getDescription() {
        return DESCRIPTION;
    }
    
    public String getErrorMsgFromResponse() {
        return errorMsgFromResponse;
    }
}